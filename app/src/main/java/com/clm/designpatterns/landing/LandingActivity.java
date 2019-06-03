package com.clm.designpatterns.landing;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.clm.designpatterns.R;
import com.clm.designpatterns.base.BaseActivity;
import com.clm.designpatterns.lifecycle.DesignPatternsActivityLifecycleListener;

import javax.inject.Inject;

public class LandingActivity extends BaseActivity {

    @Inject
    DesignPatternsActivityLifecycleListener lifecycleListener;

    @Override
    protected DesignPatternsActivityLifecycleListener lifecycleListener(){
        return lifecycleListener;
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_landing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
