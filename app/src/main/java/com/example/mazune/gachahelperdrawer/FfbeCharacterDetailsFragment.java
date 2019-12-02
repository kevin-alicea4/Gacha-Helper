package com.example.mazune.gachahelperdrawer;

import android.app.Fragment;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

/**
 * Created by Mazune on 3/19/2018.
 */

public class FfbeCharacterDetailsFragment extends Fragment {

    View myView;
    Cursor c = null;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = inflater.inflate(R.layout.ffbe_character_details_layout, container, false);
        Integer id = getArguments().getInt("ID");
        String name, rarity, trust, gender, HP, MP, ATK, DEF, MAG, SPR;

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
        c = myDbHelper.query("ffbe_characters",null,null,null,null,null,null);
        c.move(id);
        String img_name = c.getString(6);
        ImageView imgview = (ImageView) myView.findViewById(R.id.imageViewCharImg);
        int resId = getResources().getIdentifier(img_name, "drawable", getActivity().getPackageName());
        imgview.setImageResource(resId);

        name = c.getString(2);
        rarity = c.getString(3);
        trust = c.getString(5);
        gender = c.getString(4);
        HP = c.getString(7);
        MP = c.getString(8);
        ATK = c.getString(9);
        DEF = c.getString(10);
        MAG = c.getString(11);
        SPR = c.getString(12);


        ((TextView) myView.findViewById(R.id.textViewName)).setText(name);
        ((TextView) myView.findViewById(R.id.textViewRarity)).setText(rarity);
        ((TextView) myView.findViewById(R.id.textViewTrust)).setText(trust);
        ((TextView) myView.findViewById(R.id.textViewGender)).setText((gender));
        ((TextView) myView.findViewById(R.id.textViewHP)).setText((HP));
        ((TextView) myView.findViewById(R.id.textViewMP)).setText((MP));
        ((TextView) myView.findViewById(R.id.textViewATK)).setText((ATK));
        ((TextView) myView.findViewById(R.id.textViewDEF)).setText((DEF));
        ((TextView) myView.findViewById(R.id.textViewMAG)).setText((MAG));
        ((TextView) myView.findViewById(R.id.textViewSPR)).setText((SPR));


        return myView;
        }
    }






