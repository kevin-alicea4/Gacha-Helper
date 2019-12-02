package com.example.mazune.gachahelperdrawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Mazune on 3/19/2018.
 */

public class FfbeBannerFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View a = inflater.inflate(R.layout.ffbe_banner_layout, container, false);
        ImageButton imgBtnBanner1 = (ImageButton) a.findViewById(R.id.imgBtnBanner1);
        imgBtnBanner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                FfbeBannerResultsFragment ffbeBannerResultsFragment = new FfbeBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 1);
                ffbeBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, ffbeBannerResultsFragment, ffbeBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner2 = (ImageButton) a.findViewById(R.id.imgBtnBanner2);
        imgBtnBanner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                FfbeBannerResultsFragment ffbeBannerResultsFragment = new FfbeBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 2);
                ffbeBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, ffbeBannerResultsFragment, ffbeBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner3 = (ImageButton) a.findViewById(R.id.imgBtnBanner3);
        imgBtnBanner3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                FfbeBannerResultsFragment ffbeBannerResultsFragment = new FfbeBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 3);
                ffbeBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, ffbeBannerResultsFragment, ffbeBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ((MainActivity)getActivity())
                .setActionBarTitle("Final Fantasy Brave Exvius");

        return a;
    }
}
