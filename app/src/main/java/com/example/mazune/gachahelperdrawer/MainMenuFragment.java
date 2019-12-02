package com.example.mazune.gachahelperdrawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by k3vo1 on 4/1/2018.
 */

public class MainMenuFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.main_menu, container, false);
        ImageButton btnOpenFFBE = (ImageButton) v.findViewById(R.id.imageButtonFFBE);
        btnOpenFFBE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FfbeMainMenu ffbeMainMenu = new FfbeMainMenu();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.content_frame, ffbeMainMenu, ffbeMainMenu.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton btnOpenBBS = (ImageButton) v.findViewById(R.id.imageButtonBBS);
        btnOpenBBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BbsMainMenu bbsMainMenu = new BbsMainMenu();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.content_frame, bbsMainMenu, bbsMainMenu.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ((MainActivity)getActivity())
                .setActionBarTitle("Gacha Helper");

        return v;
    }
}
