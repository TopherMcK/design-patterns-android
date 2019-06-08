package com.clm.designpatterns.strategy.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.clm.designpatterns.R;
import com.clm.designpatterns.base.BaseActivity;

public class StrategyActivity extends BaseActivity {

    TabLayout tabLayout;

    @Override
    protected int layoutRes() {
        return R.layout.activity_strategy;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupPagerAdapter();
    }

    private void setupPagerAdapter(){
        ViewPager viewPager = findViewById(R.id.pager);
        DuckPagerAdapter duckPagerAdapter = new DuckPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(duckPagerAdapter);
        tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
