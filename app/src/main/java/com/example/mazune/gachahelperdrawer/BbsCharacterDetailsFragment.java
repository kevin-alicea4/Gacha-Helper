package com.example.mazune.gachahelperdrawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

import static com.example.mazune.gachahelperdrawer.R.id.imageViewCharImg;

/**
 * Created by Mazune on 3/19/2018.
 */

public class BbsCharacterDetailsFragment extends Fragment {

    View myView;
    Cursor c = null;
    Cursor c2 = null;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = inflater.inflate(R.layout.bbs_character_details_layout, container, false);
        final Integer idChar = getArguments().getInt("ID");
        final Integer idAcc = getArguments().getInt("ID_ACC");
        String name, attri, baseSTA, baseATK, baseDEF, baseFCS, baseSP, itemSTA, itemATK, itemDEF, itemFCS, itemSP, itemAffi, itemAttri,
                totalSTA, totalATK, totalDEF, totalFCS, totalSP, affi1, affi2, killer1, killer2, affi, killer;

        DatabaseHelper myDbHelper = new DatabaseHelper(getActivity());

        try {
            myDbHelper.createDataBase();
        } catch (IOException ioe) {
            throw new Error("Unable to create database");
        }

        try {
            myDbHelper.openDataBase();
        } catch (SQLException sqle) {
            throw sqle;
        }
        c = myDbHelper.query("bbs_characters",null,null,null,null,null,null);
        c.move(idChar);
        String img_name = c.getString(13);
        ImageView imgview = (ImageView) myView.findViewById(R.id.imageViewCharImg);
        int resId = getResources().getIdentifier(img_name, "drawable", getActivity().getPackageName());
        imgview.setImageResource(resId);

        attri = c.getString(1).toLowerCase();
        name = c.getString(3);
        baseSTA = c.getString(4);
        baseATK = c.getString(5);
        baseDEF = c.getString(6);
        baseFCS = c.getString(7);
        baseSP = c.getString(8);
        affi1 = c.getString(9);
        affi2 = c.getString(10);
        killer1 = c.getString(11);
        killer2 = c.getString(12);

        if(affi2 == null)
            affi = "Affiliation: " + affi1;
        else
            affi = "Affiliation: " + affi1 + "/" + affi2;

        if(killer2 == null)
            killer = "Killer: " + killer1;
        else
            killer = "Killer: " + killer1 + "/" + killer2;

        ((TextView) myView.findViewById(R.id.textViewName)).setText(name);
        ((TextView) myView.findViewById(R.id.textViewBaseSTA)).setText(baseSTA);
        ((TextView) myView.findViewById(R.id.textViewBaseATK)).setText(baseATK);
        ((TextView) myView.findViewById(R.id.textViewBaseDEF)).setText(baseDEF);
        ((TextView) myView.findViewById(R.id.textViewBaseFCS)).setText(baseFCS);
        ((TextView) myView.findViewById(R.id.textVieWBaseSP)).setText(baseSP);
        ((TextView) myView.findViewById(R.id.textViewAffi)).setText(affi);
        ((TextView) myView.findViewById(R.id.textViewKiller)).setText(killer);

        totalSTA = baseSTA;
        totalATK = baseATK;
        totalDEF = baseDEF;
        totalFCS = baseFCS;
        totalSP = baseSP;

        ((TextView) myView.findViewById(R.id.textViewTotalSTA)).setText(totalSTA);
        ((TextView) myView.findViewById(R.id.textViewTotalATK)).setText(totalATK);
        ((TextView) myView.findViewById(R.id.textViewTotalDEF)).setText(totalDEF);
        ((TextView) myView.findViewById(R.id.textViewTotalFCS)).setText(totalFCS);
        ((TextView) myView.findViewById(R.id.textVieWTotalSP)).setText(totalSP);


        ImageView Acc1 =  myView.findViewById(R.id.imageViewAcc1);
        Button btnAcc1 = (Button) myView.findViewById(R.id.buttonAccessory1);
        Acc1.setVisibility(myView.GONE);

        if(idAcc != -1)
        {
            c2 = myDbHelper.query("bbs_accessories",null,null,null,null,null,null);
            c2.move(idAcc);
            String acc_img_name = c2.getString(9);
            int accResId = getResources().getIdentifier(acc_img_name, "drawable", getActivity().getPackageName());
            Acc1.setImageResource(accResId);
            Acc1.setVisibility(myView.VISIBLE);
            btnAcc1.setVisibility(myView.GONE);

            itemAttri = c2.getString(2);
            itemSTA = c2.getString(3);
            itemATK = c2.getString(4);
            itemDEF = c2.getString(5);
            itemFCS = c2.getString(6);
            itemSP = c2.getString(7);
            itemAffi = c2.getString(8);

            if(itemAffi == null)
                itemAffi = "none";

            //if the item's STA value is different than null it will try to increase the item and total STA
           if(itemSTA != null) {
               //makes sure that if the item has an affiliation that it's the same of the character, if not it doesn't add the value
               if(itemAffi.equalsIgnoreCase(affi1) || itemAffi.equalsIgnoreCase(affi2) || itemAffi.equalsIgnoreCase("none"))
               {
                   //calculates the how much the item will increase the stat
                   double tempSTA = Double.parseDouble(itemSTA) * Integer.parseInt(baseSTA);
                   int StaInt = (int) tempSTA;
                   //doubles the increase in stat if the items and charcter share the same attribute
                   if (attri.equalsIgnoreCase(itemAttri))
                   {
                       StaInt = StaInt * 2;
                   }
                   String itemStaTemp;
                   //makes sure to print the right symbol based on if the value if positive or negative
                   if (StaInt > 0)
                       itemStaTemp = "+" + StaInt;
                   else
                       itemStaTemp = "" + StaInt;
                   ((TextView) myView.findViewById(R.id.textViewItemSTA)).setText(itemStaTemp);
                   int totalStaTemp = Integer.parseInt(baseSTA) + StaInt;
                   String totalStaString = "" + totalStaTemp;
                   ((TextView) myView.findViewById(R.id.textViewTotalSTA)).setText(totalStaString);
               }

           }

            if(itemATK != null) {
                double tempATK = Double.parseDouble(itemATK) * Integer.parseInt(baseATK);
                int AtkInt = (int) tempATK;
                if (attri.equalsIgnoreCase(itemAttri)) {
                    AtkInt = AtkInt * 2;
                }
                String itemAtkTemp;
                if(AtkInt > 0)
                    itemAtkTemp = "+" + AtkInt;
                else
                    itemAtkTemp = "" + AtkInt;
                ((TextView) myView.findViewById(R.id.textViewItemATK)).setText(itemAtkTemp);
                int totalAtkTemp = Integer.parseInt(baseATK) + AtkInt;
                String totalAtkString = "" +  totalAtkTemp;
                ((TextView) myView.findViewById(R.id.textViewTotalATK)).setText(totalAtkString);

            }

            if(itemDEF != null) {
                double tempDEF = Double.parseDouble(itemDEF) * Integer.parseInt(baseDEF);
                int DefInt = (int) tempDEF;
                if (attri.equalsIgnoreCase(itemAttri)) {
                    DefInt = DefInt * 2;
                }
                String itemDefTemp;
                if(DefInt > 0)
                    itemDefTemp = "+" + DefInt;
                else
                    itemDefTemp = "" + DefInt;
                ((TextView) myView.findViewById(R.id.textViewItemDEF)).setText(itemDefTemp);
                int totalDefTemp = Integer.parseInt(baseDEF) + DefInt;
                String totalDefString = "" +  totalDefTemp;
                ((TextView) myView.findViewById(R.id.textViewTotalDEF)).setText(totalDefString);

            }

            if(itemFCS != null) {

               double itemFcsDbl = Double.parseDouble(itemFCS);
               if(itemFcsDbl == 0)
               {
                   itemFcsDbl = Integer.parseInt(baseFCS) * -1;
                   int itemFcsInt = (int) itemFcsDbl;
                   String itemFcsString =  "" + itemFcsInt;
                   ((TextView) myView.findViewById(R.id.textViewItemFCS)).setText(itemFcsString);
                   ((TextView) myView.findViewById(R.id.textViewTotalFCS)).setText("0");

               }
               else {
                   double tempFCS = Double.parseDouble(itemFCS) * Integer.parseInt(baseFCS);
                   int FcsInt = (int) tempFCS;
                   if (attri.equalsIgnoreCase(itemAttri)) {
                       FcsInt = FcsInt * 2;
                   }
                   String itemFcsTemp;
                   if (FcsInt > 0)
                       itemFcsTemp = "+" + FcsInt;
                   else
                       itemFcsTemp = "" + FcsInt;
                   ((TextView) myView.findViewById(R.id.textViewItemFCS)).setText(itemFcsTemp);
                   int totalFcsTemp = Integer.parseInt(baseFCS) + FcsInt;
                   String totalFcsString = "" + totalFcsTemp;
                   ((TextView) myView.findViewById(R.id.textViewTotalFCS)).setText(totalFcsString);
               }

            }

            if(itemSP != null) {

                double itemSpDbl = Double.parseDouble(itemSP);
                if(itemSpDbl == 0)
                {
                    itemSpDbl = Integer.parseInt(baseSP) * -1;
                    int itemSpInt = (int) itemSpDbl;
                    String itemSpString =  "" + itemSpInt;
                    ((TextView) myView.findViewById(R.id.textVieWItemSP)).setText(itemSpString);
                    ((TextView) myView.findViewById(R.id.textVieWTotalSP)).setText("0");

                }
                else {
                    double tempSP = Double.parseDouble(itemSP) * Integer.parseInt(baseSP);
                    int SpInt = (int) tempSP;
                    if (attri.equalsIgnoreCase(itemAttri)) {
                        SpInt = SpInt * 2;
                    }
                    String itemSpTemp;
                    if (SpInt > 0)
                        itemSpTemp = "+" + SpInt;
                    else
                        itemSpTemp = "" + SpInt;
                    ((TextView) myView.findViewById(R.id.textVieWItemSP)).setText(itemSpTemp);
                    int totalSpTemp = Integer.parseInt(baseSP) + SpInt;
                    String totalSpString = "" + totalSpTemp;
                    ((TextView) myView.findViewById(R.id.textVieWTotalSP)).setText(totalSpString);
                }

            }

        }

        btnAcc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsAccessoryListFragment bbsAccessoryListFragment = new BbsAccessoryListFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();


                Bundle args = new Bundle();
                args.putInt("ID1", idChar);
                bbsAccessoryListFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsAccessoryListFragment, bbsAccessoryListFragment.getTag()).addToBackStack("CharDetails")
                        .commit();

            }
        });

        return myView;
    }
}






