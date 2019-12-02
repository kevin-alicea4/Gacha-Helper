package com.example.mazune.gachahelperdrawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Mazune on 3/19/2018.
 */

public class BbsMainMenu extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View b = inflater.inflate(R.layout.bbs_main_menu_layout, container, false);
        Button btnOpenBBSBanners = (Button) b.findViewById(R.id.btnOpenBBSBanners);
        btnOpenBBSBanners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BbsBannerFragment bbsBannerFragment = new BbsBannerFragment();
                FragmentManager manager2 = getFragmentManager();
                manager2.beginTransaction()
                        .replace(R.id.content_frame, bbsBannerFragment, bbsBannerFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        Button btnOpenBBSCharacter = (Button) b.findViewById(R.id.btnOpenBBSCharacter);
        btnOpenBBSCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BbsCharacterListFragment bbsCharacterListFragment = new BbsCharacterListFragment();
                FragmentManager manager1 = getFragmentManager();
                manager1.beginTransaction()
                        .replace(R.id.content_frame,bbsCharacterListFragment, bbsCharacterListFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });


        ((MainActivity)getActivity())
                .setActionBarTitle("Bleach Brave Souls");

        return  b;
    }

}
