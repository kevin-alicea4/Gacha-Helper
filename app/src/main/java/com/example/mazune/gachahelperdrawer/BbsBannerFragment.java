package com.example.mazune.gachahelperdrawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Mazune on 3/19/2018.
 */

public class BbsBannerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View a = inflater.inflate(R.layout.bbs_banner_layout, container, false);

        //sets an onClickListener to all the imagebuttons and each one invokes the same screen, but sends a different value
        ImageButton imgBtnBanner1 = (ImageButton) a.findViewById(R.id.imgBtnBanner1);
        imgBtnBanner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 1);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner2 = (ImageButton) a.findViewById(R.id.imgBtnBanner2);
        imgBtnBanner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 2);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner3 = (ImageButton) a.findViewById(R.id.imgBtnBanner3);
        imgBtnBanner3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 3);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner4 = (ImageButton) a.findViewById(R.id.imgBtnBanner4);
        imgBtnBanner4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 4);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner5 = (ImageButton) a.findViewById(R.id.imgBtnBanner5);
        imgBtnBanner5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 5);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner6 = (ImageButton) a.findViewById(R.id.imgBtnBanner6);
        imgBtnBanner6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 6);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner7 = (ImageButton) a.findViewById(R.id.imgBtnBanner7);
        imgBtnBanner7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 7);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner8 = (ImageButton) a.findViewById(R.id.imgBtnBanner8);
        imgBtnBanner8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 8);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner9 = (ImageButton) a.findViewById(R.id.imgBtnBanner9);
        imgBtnBanner9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 9);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ImageButton imgBtnBanner10 = (ImageButton) a.findViewById(R.id.imgBtnBanner10);
        imgBtnBanner10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                BbsBannerResultsFragment bbsBannerResultsFragment = new BbsBannerResultsFragment();
                FragmentManager manager1 = getFragmentManager();
                android.app.FragmentTransaction m1 = manager1.beginTransaction();
                Bundle args = new Bundle();
                args.putInt("BAN", 10);
                bbsBannerResultsFragment.setArguments(args);
                m1.replace(R.id.content_frame, bbsBannerResultsFragment, bbsBannerResultsFragment.getTag()).addToBackStack("tag")
                        .commit();
            }
        });

        ((MainActivity) getActivity())
                .setActionBarTitle("Bleach Brave Souls");

        return a;
    }

}


