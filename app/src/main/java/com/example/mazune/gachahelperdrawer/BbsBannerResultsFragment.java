package com.example.mazune.gachahelperdrawer;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Mazune on 3/19/2018.
 */

public class BbsBannerResultsFragment extends Fragment {

    View myView;
    boolean flag5Star = false;
    int Orbs = 0;
    ArrayList<Integer> Characters = new ArrayList<>();

    int[] textviewlist = {
            R.id.textView1,
            R.id.textView2,
            R.id.textView3,
            R.id.textView4,
            R.id.textView5,
            R.id.textView6,
            R.id.textView7,
            R.id.textView8,
            R.id.textView9,
            R.id.textView10
    };

    int [] imageviewlist = {
            R.id.imageView1,
            R.id.imageView2,
            R.id.imageView3,
            R.id.imageView4,
            R.id.imageView5,
            R.id.imageView6,
            R.id.imageView7,
            R.id.imageView8,
            R.id.imageView9,
            R.id.imageView10
    };

    //array most of the 3 stars' image id that are use in every banner
    int [] Chars3StarId = {R.drawable.orihime_3star, R.drawable.mayuri_3star, R.drawable.kenpachi_3star, R.drawable.ichigo_3star,
                         R.drawable.momo_3star, R.drawable.rukia_3star, R.drawable.uryu_3star, R.drawable.gin_3star, R.drawable.chad_3star,
                         R.drawable.toshiro_3star, R.drawable.yumichika_3star, R.drawable.shunsui_3star, R.drawable.jushiro_3star};//13 char
    //array most of the 3 stars' names that are use in every banner
    String [] Chars3StarName = {"Orihime", "Mayuri", "Kenpachi", "Ichigo", "Momo", "Rukia", "Uryu", "Gin", "Chad", "Toshiro", "Yumichika",
                                 "Shunsui", "Jushiro"};//13 char
    //array most of the 4 stars' image id that are use in every banner
    int [] Chars4StarId = {R.drawable.grimmjow_4star, R.drawable.nnoitora_4star, R.drawable.mashiro_4star, R.drawable.sajin_4star,
                           R.drawable.byakuya_4star, R.drawable.kira_4star,R.drawable.urahara_4star, R.drawable.retsu_4star,
                           R.drawable.yumichika_4star, R.drawable.renji_4star, R.drawable.mayuri_4star, R.drawable.hanataro_4star};//12 char
    //array most of the 4 stars' names that are use in every banner
    String [] Chars4StarName = {"Grimmjow", "Nnoitora", "Mashiro", "Sajin", "Byakuya", "Kira", "Urahara", "Retsu", "Yumichika","Renji",
                                "Mayuri", "Hanataro"};//12 char
    int counter5star = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.bbs_banner_results_layout, container, false);

        Integer banner = getArguments().getInt("BAN");

        ((MainActivity) getActivity())
                .setActionBarTitle("Results");


        Button btnSummonAgain = (Button) myView.findViewById(R.id.btnSummonAgain);
        Button btnSummonUntil5Star = (Button) myView.findViewById(R.id.btnSummonUntil5star);

        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setTextColor(Color.BLACK);


        //invokes a function and sets the buttons to invoke that same function depending on the value recieved
        switch(banner) {
            case 1:
                    tybwabg();
                    btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tybwabg();
                }
            });
                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            tybwabg();

                           }while(!flag5Star);
                    }
                });
                    break;
            case 2:
                tybwtts();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tybwtts();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            tybwtts();

                        }while(!flag5Star);
                    }
                });
                break;
            case 3:
                tybwewo();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tybwewo();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            tybwewo();

                        }while(!flag5Star);
                    }
                });
                break;
            case 4:
                christmas();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        christmas();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            christmas();

                        }while(!flag5Star);
                    }
                });
                break;
            case 5:
                valentine();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        valentine();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            valentine();

                        }while(!flag5Star);
                    }
                });
                break;
            case 6:
                whiteday();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        whiteday();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            whiteday();

                        }while(!flag5Star);
                    }
                });
                break;
            case 7:
                diamonddust();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        diamonddust();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            diamonddust();

                        }while(!flag5Star);
                    }
                });
                break;
            case 8:
                memories();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        memories();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            memories();

                        }while(!flag5Star);
                    }
                });
                break;
            case 9:
                hellverse();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        hellverse();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            hellverse();

                        }while(!flag5Star);
                    }
                });
                break;
            case 10:
                lamentation();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        lamentation();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            lamentation();

                        }while(!flag5Star);
                    }
                });
                break;

        }


        return myView;
    }

    public void tybwabg()
    {
        Orbs += 250;
        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setText("Orbs spent: " + Orbs);

        Characters.clear();

        //generates 10 random numbers that will determine the characters' rarity
        for (int i = 0; i < 10; i++)
        {
            Random rand = new Random();
            int s = rand.nextInt(100);
            Characters.add(s);

        }

        //sorts the numbers generated in descending order
        Collections.sort(Characters);
        Collections.reverse(Characters);

        //puts the image and name of the character that got picked in the imageview and textview
        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            int star=0;
            //determines characters' rarity
            if(i>0) {
                if (Characters.get(i) <= 69)
                    star = 3;
                else if (Characters.get(i) <= 93)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(Characters.get(i) <= 93)
                    star = 4;
                else
                    star=5;
            }

            //determines what character was gotten based on the randomly generated number
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                        break;
                        case 5:
                            int c5 = rand.nextInt(9);
                            flag5Star = true;
                            counter5star++;
                            switch (c5) {
                                case 0:
                                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.ichigo_tybw_5star);
                                    ((TextView) myView.findViewById(textviewlist[i])).setText("Ichigo");
                                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                                    break;
                                case 1:
                                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.rukia_tybw_5star);
                                    ((TextView) myView.findViewById(textviewlist[i])).setText("Rukia");
                                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                                    break;
                                case 2:
                                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.halibel_speed_5star);
                                    ((TextView) myView.findViewById(textviewlist[i])).setText("Halibel");
                                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                                    break;
                                case 3:
                                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.tsukishima_tlv_5star);
                                    ((TextView) myView.findViewById(textviewlist[i])).setText("Tsukishima");
                                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                                    break;
                                case 4:
                                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.renji_tybw_5star);
                                    ((TextView) myView.findViewById(textviewlist[i])).setText("Renji");
                                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                                    break;
                                case 5:
                                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.ginjo_tlv_5star);
                                    ((TextView) myView.findViewById(textviewlist[i])).setText("Ginjo");
                                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                                    break;
                                case 6:
                                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.riruka_tlv_5star);
                                    ((TextView) myView.findViewById(textviewlist[i])).setText("Riruka");
                                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                                    break;
                                case 7:
                                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.ulquiorra_mind_5star);
                                    ((TextView) myView.findViewById(textviewlist[i])).setText("Ulquiorra");
                                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                                    break;
                                case 8:
                                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.stark_heart_5star);
                                    ((TextView) myView.findViewById(textviewlist[i])).setText("Stark");
                                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                                    break;

                            }
                    }
            }

        TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
        textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);

        }

    public void tybwtts()
    {

        Orbs += 250;
        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setText("Orbs spent: " + Orbs);

        Characters.clear();

        for (int i = 0; i < 10; i++)
        {
            Random rand = new Random();
            int s = rand.nextInt(100);
            Characters.add(s);

        }

        Collections.sort(Characters);
        Collections.reverse(Characters);

        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            int star=0;
            if(i>0) {
                if (Characters.get(i) <= 69)
                    star = 3;
                else if (Characters.get(i) <= 96)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(Characters.get(i) <= 96)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 5:
                    int c5 = rand.nextInt(6);
                    flag5Star = true;
                    counter5star++;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.yachiru_tybw_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Yachiru");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.unohana_tybw_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Unohana");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.kenpachi_tybw_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Kenpachi");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.kaname_hm_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Kaname");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.aaroniero_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aaroniero");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.zommari_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Zommari");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                    }
            }
        }
        TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
        textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);
    }

    public void tybwewo()
    {
        Orbs += 250;
        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setText("Orbs spent: " + Orbs);

        Characters.clear();

        for (int i = 0; i < 10; i++)
        {
            Random rand = new Random();
            int s = rand.nextInt(100);
            Characters.add(s);

        }

        Collections.sort(Characters);
        Collections.reverse(Characters);

        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            int star=0;
            if(i>0) {
                if (Characters.get(i) <= 69)
                    star = 3;
                else if (Characters.get(i) <= 93)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(Characters.get(i) <=  93)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 5:
                    int c5 = rand.nextInt(9);
                    flag5Star = true;
                    counter5star++;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.byakuya_tybw_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Byakuya");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.toshiro_tybw_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Toshiro");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.shunsui_tybw_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Shunsui");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.sajin_tybw_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Sajin");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.nemu_mind_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Nemu");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.urahara_heart_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Urahara");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.love_tech_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Love");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.rose_power_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Rose");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.yachiru_speed_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Yachiru");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;

                    }
            }
        }

        TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
        textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);
    }

    public void christmas()
    {
        Orbs += 250;
        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setText("Orbs spent: " + Orbs);

        Characters.clear();

        for (int i = 0; i < 10; i++)
        {
            Random rand = new Random();
            int s = rand.nextInt(100);
            Characters.add(s);

        }

        Collections.sort(Characters);
        Collections.reverse(Characters);

        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            int star=0;
            if(i>0) {
                if (Characters.get(i) <= 69)
                    star = 3;
                else if (Characters.get(i) <= 93)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(Characters.get(i) <= 93)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 4:
                    int c4 = rand.nextInt(14);
                    switch (c4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                            ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 12:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.hanataro_christmas_4star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Hanataro");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 13:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.shuhei_christmas_4star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Shuhei");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                    }
                    break;
                case 5:
                    int c5 = rand.nextInt(10);
                    flag5Star = true;
                    counter5star++;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.ururu_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ururu");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.rukia_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Rukia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.riruka_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Riruka");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.szayelaporro_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Szayelaporro");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.halibel_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Halibel");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.urahara_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Urahara");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.lisa_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Lisa");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.jushiro_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Jushiro");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.hiyori_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Hiyori");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 9:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.sajin_christmas_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Sajin");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;

                    }
            }
        }

        TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
        textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);
    }

    public void valentine()
    {
        Orbs += 250;
        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setText("Orbs spent: " + Orbs);

        Characters.clear();

        for (int i = 0; i < 10; i++)
        {
            Random rand = new Random();
            int s = rand.nextInt(100);
            Characters.add(s);

        }

        Collections.sort(Characters);
        Collections.reverse(Characters);

        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            int star=0;
            if(i>0) {
                if (Characters.get(i) <= 69)
                    star = 3;
                else if (Characters.get(i) <= 93)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(Characters.get(i) <= 93)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 4:
                    int c4 = rand.nextInt(14);
                    switch (c4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                            ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 12:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.rangiku_valentine_4star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Rangiku");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 13:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.soifon_valentine_4star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Soi Fon");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                    }
                    break;
                case 5:
                    int c5 = rand.nextInt(7);
                    flag5Star = true;
                    counter5star++;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.yoruichi_cacao_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Yoruichi");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.nanao_cacao_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Nanao");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.halibel_cacao_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Halibel");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.yachiru_valentine_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Yachiru");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.momo_valentine_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Momo");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.rukia_valentine_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Rukia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.neliel_valentine_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Neliel");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                    }
            }
        }

        TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
        textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);
    }

    public void whiteday()
    {
        Orbs += 250;
        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setText("Orbs spent: " + Orbs);

        Characters.clear();

        for (int i = 0; i < 10; i++)
        {
            Random rand = new Random();
            int s = rand.nextInt(100);
            Characters.add(s);

        }

        Collections.sort(Characters);
        Collections.reverse(Characters);

        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            int star=0;
            if(i>0) {
                if (Characters.get(i) <= 69)
                    star = 3;
                else if (Characters.get(i) <= 93)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(Characters.get(i) <= 93)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 5:
                    int c5 = rand.nextInt(11);
                    flag5Star = true;
                    counter5star++;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.ulquiorra_whiteday_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ulquiorra");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.toshiro_whiteday_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Toshiro");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.gin_whiteday_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Gin");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.shuhei_whiteday_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Shuhei");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.grimmjow_whiteday_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Grimmjow");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.byakuya_whiteday_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Byakuya");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.kenpachi_whiteday_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Kenpachi");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.aizen_whiteday_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aizen");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.urahara_cacao_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Urahara");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 9:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.stark_cacao_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Stark");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 10:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.tsukishima_cacao_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Tsukishima");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;

                    }
            }
        }

        TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
        textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);
    }

    public void diamonddust()
    {
        Orbs += 250;
        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setText("Orbs spent: " + Orbs);

        Characters.clear();

        for (int i = 0; i < 10; i++)
        {
            Random rand = new Random();
            int s = rand.nextInt(100);
            Characters.add(s);

        }

        Collections.sort(Characters);
        Collections.reverse(Characters);

        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            int star=0;
            if(i>0) {
                if (Characters.get(i) <= 69)
                    star = 3;
                else if (Characters.get(i) <= 93)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(Characters.get(i) <= 93)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 5:
                    int c5 = rand.nextInt(9);
                    flag5Star = true;
                    counter5star++;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.toshiro_movie2_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Toshiro");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.kusaka_movie2_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Kusaka");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.yinyan_movie2_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Yin & Yan");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.white_ichigo_fh_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("White Ichigo");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.unohana_mind_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Unohana");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.mila_rose_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Mila Rose");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.zommari_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Zommari");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.gin_heart_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Gin");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.mashiro_speed_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Mashiro");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;

                    }
            }
        }

        TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
        textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);
    }

    public void memories()
    {
        Orbs += 250;
        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setText("Orbs spent: " + Orbs);

        Characters.clear();

        for (int i = 0; i < 10; i++)
        {
            Random rand = new Random();
            int s = rand.nextInt(100);
            Characters.add(s);

        }

        Collections.sort(Characters);
        Collections.reverse(Characters);

        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            int star=0;
            if(i>0) {
                if (Characters.get(i) <= 69)
                    star = 3;
                else if (Characters.get(i) <= 93)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(Characters.get(i) <= 93)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 5:
                    int c5 = rand.nextInt(9);
                    flag5Star = true;
                    counter5star++;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.ichigo_movie_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ichigo");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.senna_movie_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Senna");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.ganryu_movie_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ganryu");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.tsukishima_tlv_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Tsukishima");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.isane_power_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Isane");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.suzumebachi_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Suzumebachi");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.yachiru_speed_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Yachiru");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.love_tech_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Love");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.rose_power_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Rose");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;

                    }
            }
        }

        TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
        textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);
    }

    public void hellverse()
    {
        Orbs += 250;
        TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
        textViewOrbsSpent.setText("Orbs spent: " + Orbs);

        Characters.clear();

        for (int i = 0; i < 10; i++)
        {
            Random rand = new Random();
            int s = rand.nextInt(100);
            Characters.add(s);

        }

        Collections.sort(Characters);
        Collections.reverse(Characters);

        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            int star=0;
            if(i>0) {
                if (Characters.get(i) <= 69)
                    star = 3;
                else if (Characters.get(i) <= 93)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(Characters.get(i) <= 93)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                    ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                    break;
                case 5:
                    int c5 = rand.nextInt(9);
                    flag5Star = true;
                    counter5star++;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.ichigo_movie4_power_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ichigo");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.kokuto_movie4_speed_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Kokuto");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.shuren_movie4_tech_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Shuren");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.barragan_mind_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Barragan");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.szayelaporro_speed_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Szayelaporro");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.wonderweiss_tech_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Wonderweiss");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.mila_rose_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Mila Rose");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.yammy_speed_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Yammy");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.tensa_zangetsu_tech_5star);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Tensa Zangetsu");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;

                    }
            }
        }

        TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
        textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);
     }

     public void lamentation()
     {
         Orbs += 250;
         TextView textViewOrbsSpent = (TextView) myView.findViewById(R.id.textViewOrbSpent);
         textViewOrbsSpent.setText("Orbs spent: " + Orbs);

         Characters.clear();

         for (int i = 0; i < 10; i++)
         {
             Random rand = new Random();
             int s = rand.nextInt(100);
             Characters.add(s);

         }

         Collections.sort(Characters);
         Collections.reverse(Characters);

         for (int i = 0; i < 10; i++) {

             Random rand = new Random();
             int star=0;
             if(i>0) {
                 if (Characters.get(i) <= 69)
                     star = 3;
                 else if (Characters.get(i) <= 93)
                     star = 4;
                 else
                     star = 5;
             }
             else
             {
                 if(Characters.get(i) <= 93)
                     star = 4;
                 else
                     star=5;
             }
             switch (star) {
                 case 3:
                     int c3 = rand.nextInt(13);
                     ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars3StarId[c3]);
                     ((TextView) myView.findViewById(textviewlist[i])).setText(Chars3StarName[c3]);
                     ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                     break;
                 case 4:
                     int c4 = rand.nextInt(12);
                     ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(Chars4StarId[c4]);
                     ((TextView) myView.findViewById(textviewlist[i])).setText(Chars4StarName[c4]);
                     ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                     break;
                 case 5:
                     int c5 = rand.nextInt(9);
                     flag5Star = true;
                     counter5star++;
                     switch (c5) {
                         case 0:
                             ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.yamamoto_lamentation_5star);
                             ((TextView) myView.findViewById(textviewlist[i])).setText("Genryusai");
                             ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                             break;
                         case 1:
                             ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.kaname_heart_5star);
                             ((TextView) myView.findViewById(textviewlist[i])).setText("Kaname");
                             ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                             break;
                         case 2:
                             ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.mayuri_power_5star);
                             ((TextView) myView.findViewById(textviewlist[i])).setText("Mayuri");
                             ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                             break;
                         case 3:
                             ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.halibel_speed_5star);
                             ((TextView) myView.findViewById(textviewlist[i])).setText("Halibel");
                             ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                             break;
                         case 4:
                             ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.stark_heart_5star);
                             ((TextView) myView.findViewById(textviewlist[i])).setText("Stark");
                             ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                             break;
                         case 5:
                             ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.chojiro_tagteam_mind_5star);
                             ((TextView) myView.findViewById(textviewlist[i])).setText("Chojiro");
                             ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                             break;
                         case 6:
                             ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.nnoitora_atky_power_5star);
                             ((TextView) myView.findViewById(textviewlist[i])).setText("Nnoitora");
                             ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                             break;
                         case 7:
                             ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.ginjo_tlv_5star);
                             ((TextView) myView.findViewById(textviewlist[i])).setText("Ginjo");
                             ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                             break;
                         case 8:
                             ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.tetsuzaemon_5star);
                             ((TextView) myView.findViewById(textviewlist[i])).setText("Tetsuzaemon");
                             ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                             break;

                     }
             }
         }

         TextView textView5starsPulled = (TextView) myView.findViewById(R.id.textView5starsPulled);
         textView5starsPulled.setText(" Total 5*s pulled: " + counter5star);
     }

    }

