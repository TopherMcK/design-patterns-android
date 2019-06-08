package com.clm.designpatterns.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.clm.designpatterns.R;
import com.clm.designpatterns.command.CommandActivity;
import com.clm.designpatterns.landing.LandingActivity;
import com.clm.designpatterns.lifecycle.DesignPatternsActivityLifecycleListener;
import com.clm.designpatterns.strategy.ui.StrategyActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity extends DaggerAppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Inject DesignPatternsActivityLifecycleListener lifecycleListener;

    @LayoutRes
    protected abstract int layoutRes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutRes());
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ButterKnife.bind(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
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
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        // Check Lifecycle listener to make sure the current activity
        // is not able to be launched from the menu
        if(id == R.id.nav_home &&
                !(lifecycleListener.getCurrentActivity() instanceof LandingActivity)) {
            launchPatternActivity(LandingActivity.class);
        } else if (id == R.id.nav_strategy &&
                !(lifecycleListener.getCurrentActivity() instanceof StrategyActivity)) {
            launchPatternActivity(StrategyActivity.class);
        } else if(id == R.id.nav_command && !(lifecycleListener.getCurrentActivity() instanceof CommandActivity)){
            launchPatternActivity(CommandActivity.class);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    protected void launchPatternActivity(Class<?> activityToStart){
        Intent newActivity = new Intent(BaseActivity.this, activityToStart);
        this.startActivity(newActivity);
    }
}
