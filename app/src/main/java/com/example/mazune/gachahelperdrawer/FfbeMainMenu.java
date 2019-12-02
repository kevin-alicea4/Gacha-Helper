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

public class FfbeMainMenu extends Fragment{



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.ffbe_main_menu_layout, container, false);
        Button btnOpenSecondFragment = (Button) v.findViewById(R.id.btnOpenSecondLayout);
        btnOpenSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FfbeBannerFragment ffbeBannerFragment = new FfbeBannerFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.content_frame, ffbeBannerFragment, ffbeBannerFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        Button btnOpenFfbeCharacter = (Button) v.findViewById(R.id.btnOpenFFBECharList);
        btnOpenFfbeCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FfbeCharacterListFragment ffbeCharacterListFragment = new FfbeCharacterListFragment();
                FragmentManager manager1 = getFragmentManager();
                manager1.beginTransaction()
                        .replace(R.id.content_frame,ffbeCharacterListFragment, ffbeCharacterListFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ((MainActivity)getActivity())
                .setActionBarTitle("Final Fantasy Brave Exvius");

        return v;
    }
}
