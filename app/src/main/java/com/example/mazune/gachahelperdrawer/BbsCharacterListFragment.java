package com.example.mazune.gachahelperdrawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.SearchManager;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Mazune on 3/19/2018.
 */

public class BbsCharacterListFragment extends Fragment {

    View myView;
    Cursor c =  null;
    ArrayList<Integer> charId = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = inflater.inflate(R.layout.bbs_character_list_layout, container, false);

        createGridView();

        final SearchView inputTxt = (SearchView) myView.findViewById(R.id.inputChar);
        inputTxt.setIconifiedByDefault(false);

        //creates gridview of characters based on the input in the searchview
        inputTxt.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s)
            {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                if(newText == "")
                    createGridView();
                else
                    createSearchGridView(newText.toLowerCase());
                return false;
            }
        });

        return myView;
    }

    //sets onClickListener of every imageview of a character
    public void gridViewlistener(){
        GridView gridview = (GridView) myView.findViewById(R.id.gridviewChar);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {     //todavia no funciona bien
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                BbsCharacterDetailsFragment bbsCharacterDetailsFragment = new BbsCharacterDetailsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("ID", charId.get(position));
                bbsCharacterDetailsFragment.setArguments(args);
                args.putInt("ID_ACC", -1);
                bbsCharacterDetailsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsCharacterDetailsFragment, bbsCharacterDetailsFragment.getTag()).addToBackStack("CharList")
                        .commit();
            }
        });

    }

    //creates a gridview with only the characters that have the text of the searchview in their name
    public void createSearchGridView(String txt ){
        GridView gridview = (GridView) myView.findViewById(R.id.gridviewChar);
        final GridAdapter gridadapter = new GridAdapter(getActivity());
        charId.clear();

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
        if (c.moveToLast()) {
            while (!c.isBeforeFirst()) {
                String img_name = c.getString(13); //
                int resId = getResources().getIdentifier(img_name, "drawable", getActivity().getPackageName());
                String name = c.getString(2).toLowerCase();
                if (name.contains(txt))
                {
                    gridadapter.imageIds.add(resId);
                    charId.add(c.getInt(0));
                }
                c.moveToPrevious();
            }
        }

        gridview.setAdapter(gridadapter);
        gridViewlistener();
    }

    //creates a gridview with  every character
    public void createGridView(){
        GridView gridview = (GridView) myView.findViewById(R.id.gridviewChar);
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
        c = myDbHelper.query("bbs_characters",null,null,null,null,null,null);
        if (c.moveToLast()) {
            while (!c.isBeforeFirst()) {
                String img_name = c.getString(13); //
                int resId = getResources().getIdentifier(img_name, "drawable", getActivity().getPackageName());
                gridadapter.imageIds.add(resId);
                charId.add(c.getInt(0));
                c.moveToPrevious();
            }
        }

        gridview.setAdapter(gridadapter);
        gridViewlistener();
    }
}

