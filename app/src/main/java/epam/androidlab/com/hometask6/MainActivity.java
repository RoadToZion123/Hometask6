package epam.androidlab.com.hometask6;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import epam.androidlab.com.hometask6.fragments.RecyclerView;
import epam.androidlab.com.hometask6.fragments.HuskyFragment;
import epam.androidlab.com.hometask6.fragments.LabradorFragment;
import epam.androidlab.com.hometask6.fragments.CustomView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);

        /*ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();*/

        /*ImageView drawerHeader = (ImageView) findViewById(R.id.drawer_header);
        Uri uri = Uri.parse("developeroleg.ucoz.ru/Images/Article/android-wins.jpg");
        Picasso.with(this).load(uri).into(drawerHeader);*/

    }

    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.nav_rv:
                fragment = new RecyclerView();
                break;
            case R.id.nav_smiley:
                fragment = new CustomView();
                break;
            case R.id.nav_hasky:
                fragment = new HuskyFragment();
                break;
            case R.id.nav_labrador:
                fragment = new LabradorFragment();
                break;
        }
        if (fragment !=null) {

            FragmentManager myFragmentManager = getSupportFragmentManager();
            myFragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            item.setChecked(true);
            mDrawerLayout.closeDrawers();

        } else {
            Log.e(this.getClass().getName(), "Error. Fragment is not created");
        }
        return false;
    }
}
