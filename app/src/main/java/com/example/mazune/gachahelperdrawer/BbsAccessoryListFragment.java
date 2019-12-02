package com.example.mazune.gachahelperdrawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SearchView;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Mazune on 3/19/2018.
 */

public class BbsAccessoryListFragment extends Fragment {

    View myView;
    Cursor c =  null;
    ArrayList<Integer> accId = new ArrayList<>();
    Integer idChar = null;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = inflater.inflate(R.layout.bbs_accessory_list_layout, container, false);

         idChar = getArguments().getInt("ID1");

        createGridView(idChar);

        final SearchView inputTxt = (SearchView) myView.findViewById(R.id.inputAccessory);
        inputTxt.setIconifiedByDefault(false);

        //creates the gridview of items depending of the word in the searchview
        inputTxt.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(newText == "")
                    createGridView(idChar);
                else
                    createSearchGridView(newText, idChar);
                return false;
            }
        });

        return myView;
        }

        //adds an onClick function to all items on the gridview
        public void gridViewlistener(final int idChar){
            GridView gridview = (GridView) myView.findViewById(R.id.gridviewAccessory);
            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {     //todavia no funciona bien
                @Override
                public void onItemClick(AdapterView<?> parent, View v,
                                        int position, long id) {

                    BbsCharacterDetailsFragment bbsCharacterDetailsFragment = new BbsCharacterDetailsFragment();

                    FragmentManager manager1 = getFragmentManager();
                    android.app.FragmentTransaction m1 = manager1.beginTransaction();
                    Bundle args = new Bundle();
                    args.putInt("ID_ACC", accId.get(position));
                    bbsCharacterDetailsFragment.setArguments(args);
                    args.putInt("ID", idChar);
                    bbsCharacterDetailsFragment.setArguments(args);


                   m1.replace(R.id.content_frame, bbsCharacterDetailsFragment, bbsCharacterDetailsFragment.getTag()).addToBackStack("AccList")
                          .commit();

                }
            });

        }

        //creates the gridview with only the items that have the same name as what the user put in the searchview
        public void createSearchGridView(String txt, int idChar ){
        GridView gridview = (GridView) myView.findViewById(R.id.gridviewAccessory);
        final GridAdapter gridadapter = new GridAdapter(getActivity());
        accId.clear();

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
        c = myDbHelper.query("bbs_accessories",null,null,null,null,null,null);
        if (c.moveToLast()) {
            while (!c.isBeforeFirst()) {
                String img_name = c.getString(9); //
                int resId = getResources().getIdentifier(img_name, "drawable", getActivity().getPackageName());
                String name = c.getString(1).toLowerCase();
                if (name.contains(txt))
                {
                    gridadapter.imageIds.add(resId);
                    accId.add(c.getInt(0));
                }
                c.moveToPrevious();
            }
        }

        gridview.setAdapter(gridadapter);
        gridViewlistener(idChar);
    }

    //creates the default gridview with all the items
    public void createGridView(int idChar){
        GridView gridview = (GridView) myView.findViewById(R.id.gridviewAccessory);
        final GridAdapter gridadapter = new GridAdapter(getActivity());

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
        c = myDbHelper.query("bbs_accessories",null,null,null,null,null,null);
        if (c.moveToLast()) {
            while (!c.isBeforeFirst()) {
                String img_name = c.getString(9); //
                int resId = getResources().getIdentifier(img_name, "drawable", getActivity().getPackageName());
                gridadapter.imageIds.add(resId);
                accId.add(c.getInt(0));
                c.moveToPrevious();
            }
        }

        gridview.setAdapter(gridadapter);
        gridViewlistener(idChar);
        }
    }

