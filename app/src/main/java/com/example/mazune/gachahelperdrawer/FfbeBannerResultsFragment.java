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

import java.util.Random;

/**
 * Created by Mazune on 3/19/2018.
 */

public class FfbeBannerResultsFragment extends Fragment {

    View myView;
    boolean flag5Star = false;
    int Lapis = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.ffbe_banner_results_layout, container, false);

        Integer banner = getArguments().getInt("BAN");

        ((MainActivity) getActivity())
                .setActionBarTitle("Results");

        Button btnSummonAgain = (Button) myView.findViewById(R.id.btnSummonAgain);
        Button btnSummonUntil5Star = (Button) myView.findViewById(R.id.btnSummonUntil5star);

        switch (banner) {
            case 1:
                cloudBanner();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cloudBanner();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            cloudBanner();

                        }while(!flag5Star);
                    }
                });
                break;
            case 2:
                eggSeekersBanner();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        eggSeekersBanner();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            eggSeekersBanner();

                        }while(!flag5Star);
                    }
                });
                break;
            case 3:
                oliveBanner();
                btnSummonAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        oliveBanner();
                    }
                });

                btnSummonUntil5Star.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag5Star = false;
                        do {

                            oliveBanner();

                        }while(!flag5Star);
                    }
                });
                break;

        }

        return myView;
    }


    public void cloudBanner()
    {
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
                R.id.textView10,
                R.id.textView11

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
                R.id.imageView10,
                R.id.imageView11

        };

        Lapis += 5000;
        TextView textViewLapisSpent = (TextView) myView.findViewById(R.id.textViewLapisSpent);
        textViewLapisSpent.setText("Lapis spent: " + Lapis);

        for (int i = 0; i < 11; i++) {

            Random rand = new Random();
            int s = rand.nextInt(100);
            int star=0;
            if(i>0) {
                if (s <= 69)
                    star = 3;
                else if (s <= 96)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(s<=96)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    switch (c3) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_abel);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Abel");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_aiden);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aiden");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_alma);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Alma");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_amarant);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Amarant");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_amy);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Amy");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_anzelm);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Anzelm");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_arc);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Arc");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_artemios);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Artemios");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_bartz);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Bartz");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 9:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_bedille);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Bedille");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 10:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_black_waltz_three);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Black Waltz 3");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 11:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_camille);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Camille");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 12:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_cecil);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cecil");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                    }
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    switch (c4) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_agrias);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Agrias");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_amelia);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Amelia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_aria);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aria");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_ashe);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ashe");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_aura);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aura");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_beach_fina);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Beach Time Fina");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_grace);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Grace");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_bran);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Bran");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_cagnazzo);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cagnazzo");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 9:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_cedona);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cedona");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 10:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_chizuru);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Chizuru");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 11:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_chloe);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Chloe");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                    }
                    break;
                case 5:
                    int c5 = rand.nextInt(9);
                    flag5Star = true;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_ace);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ace");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_barbariccia);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Barbariccia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_cloud);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cloud");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_fryevia);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Fryevia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_mercenary_ramza);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Mercenary Ramza");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_nameless_jake);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Nameless Gunner Jake");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_noctis);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Noctis");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_olive);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Olive");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_onion_knight);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Onion Knight");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;

                    }
            }
        }

    }



    public void eggSeekersBanner()
    {
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
                R.id.textView10,
                R.id.textView11
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
                R.id.imageView10,
                R.id.imageView11
        };

        Lapis += 5000;
        TextView textViewLapisSpent = (TextView) myView.findViewById(R.id.textViewLapisSpent);
        textViewLapisSpent.setText("Lapis spent: " + Lapis);

        for (int i = 0; i < 11; i++) {

            Random rand = new Random();
            int s = rand.nextInt(100);
            int star=0;
            if(i>0) {
                if (s <= 69)
                    star = 3;
                else if (s <= 96)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(s<=96)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    switch (c3) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_abel);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Abel");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_aiden);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aiden");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_alma);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Alma");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_amarant);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Amarant");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_amy);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Amy");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_anzelm);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Anzelm");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_arc);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Arc");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_artemios);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Artemios");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_bartz);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Bartz");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 9:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_bedille);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Bedille");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 10:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_black_waltz_three);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Black Waltz 3");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 11:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_camille);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Camille");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 12:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_cecil);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cecil");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                    }
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    switch (c4) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_agrias);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Agrias");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_amelia);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Amelia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_aria);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aria");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_ashe);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ashe");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_aura);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aura");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_beach_fina);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Beach Time Fina");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_grace);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Grace");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_bran);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Bran");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_cagnazzo);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cagnazzo");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 9:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_cedona);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cedona");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 10:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_chizuru);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Chizuru");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 11:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_chloe);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Chloe");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                    }
                    break;
                case 5:
                    int c5 = rand.nextInt(9);
                    flag5Star = true;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_ace);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ace");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_barbariccia);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Barbariccia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_cloud);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cloud");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_fryevia);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Fryevia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_mercenary_ramza);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Mercenary Ramza");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_nameless_jake);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Nameless Gunner Jake");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_noctis);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Noctis");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_olive);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Olive");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_onion_knight);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Onion Knight");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;

                    }
            }
        }

    }


    public void oliveBanner()
    {
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
                R.id.textView10,
                R.id.textView11

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
                R.id.imageView10,
                R.id.imageView11

        };

        Lapis += 5000;
        TextView textViewLapisSpent = (TextView) myView.findViewById(R.id.textViewLapisSpent);
        textViewLapisSpent.setText("Lapis spent: " + Lapis);

        for (int i = 0; i < 11; i++) {

            Random rand = new Random();
            int s = rand.nextInt(100);
            int star=0;
            if(i>0) {
                if (s <= 69)
                    star = 3;
                else if (s <= 96)
                    star = 4;
                else
                    star = 5;
            }
            else
            {
                if(s<=96)
                    star = 4;
                else
                    star=5;
            }
            switch (star) {
                case 3:
                    int c3 = rand.nextInt(13);
                    switch (c3) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_abel);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Abel");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_aiden);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aiden");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_alma);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Alma");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_amarant);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Amarant");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_amy);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Amy");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_anzelm);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Anzelm");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_arc);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Arc");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_artemios);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Artemios");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_bartz);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Bartz");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 9:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_bedille);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Bedille");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 10:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_black_waltz_three);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Black Waltz 3");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 11:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_camille);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Camille");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 12:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.three_cecil);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cecil");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                    }
                    break;
                case 4:
                    int c4 = rand.nextInt(12);
                    switch (c4) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_agrias);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Agrias");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_amelia);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Amelia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_aria);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aria");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_ashe);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ashe");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_aura);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Aura");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_beach_fina);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Beach Time Fina");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_grace);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Grace");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_bran);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Bran");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_cagnazzo);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cagnazzo");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 9:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_cedona);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cedona");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 10:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_chizuru);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Chizuru");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                        case 11:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.four_chloe);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Chloe");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLACK);
                            break;
                    }
                    break;
                case 5:
                    int c5 = rand.nextInt(9);
                    flag5Star = true;
                    switch (c5) {
                        case 0:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_ace);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Ace");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 1:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_barbariccia);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Barbariccia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 2:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_cloud);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Cloud");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 3:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_fryevia);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Fryevia");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 4:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_mercenary_ramza);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Mercenary Ramza");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 5:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_nameless_jake);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Nameless Gunner Jake");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 6:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_noctis);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Noctis");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 7:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_olive);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Olive");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;
                        case 8:
                            ((ImageView) myView.findViewById(imageviewlist[i])).setImageResource(R.drawable.five_onion_knight);
                            ((TextView) myView.findViewById(textviewlist[i])).setText("Onion Knight");
                            ((TextView) myView.findViewById(textviewlist[i])).setTextColor(Color.BLUE);
                            break;

                    }
            }
        }

    }

}