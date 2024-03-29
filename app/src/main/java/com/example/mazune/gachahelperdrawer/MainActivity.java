package com.example.mazune.gachahelperdrawer;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        FragmentManager fragmentManager = getFragmentManager();

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        super.onCreate(savedInstanceState);
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame
                        , new MainMenuFragment())
                .commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.home) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new MainMenuFragment()).addToBackStack("tag")
                    .commit();
            }
        else if (id == R.id.ffbe_gacha) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new FfbeBannerFragment()).addToBackStack("tag")
                    .commit();
            }
        else if (id == R.id.ffbe_char) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new FfbeCharacterListFragment()).addToBackStack("tag")
                    .commit();
            }
        else if (id == R.id.bbs_gacha) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new BbsBannerFragment()).addToBackStack("tag")
                    .commit();
            }
        else if (id == R.id.bbs_char) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new BbsCharacterListFragment()).addToBackStack("tag")
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

}
