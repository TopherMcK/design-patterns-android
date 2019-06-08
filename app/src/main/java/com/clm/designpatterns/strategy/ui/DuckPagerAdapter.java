package com.clm.designpatterns.strategy.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.clm.designpatterns.R;
import com.clm.designpatterns.strategy.ui.fragments.BaseDuckFragment;
import com.clm.designpatterns.strategy.ui.fragments.MallardFragment;
import com.clm.designpatterns.strategy.ui.fragments.RedheadFragment;
import com.clm.designpatterns.strategy.ui.fragments.RubberDuckFragment;
import com.clm.designpatterns.strategy.ui.fragments.WoodenDuckFragment;

import dagger.android.support.DaggerAppCompatActivity;

public class DuckPagerAdapter extends FragmentStatePagerAdapter {

    private DaggerAppCompatActivity parent;

    public DuckPagerAdapter(FragmentManager fragmentManager, DaggerAppCompatActivity parent){
        super(fragmentManager);
        this.parent = parent;
    }

    @Override
    public Fragment getItem(int position) {
        BaseDuckFragment duckFragment = null;
        switch (position){
            case 0:
                duckFragment = new MallardFragment();
                break;
            case 1:
                duckFragment = new RedheadFragment();
                break;
            case 2:
                duckFragment = new RubberDuckFragment();
                break;
            case 3:
                duckFragment = new WoodenDuckFragment();
                break;
            default:
                // Do nothing... Position doesn't exist.
        }

        return duckFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return parent.getString(R.string.mallard_duck_label);
            case 1:
                return parent.getString(R.string.redhead_duck_label);
            case 2:
                return parent.getString(R.string.rubber_duck_label);
            case 3:
                return parent.getString(R.string.wooden_duck_label);
            default:
                return null;
        }
    }
}
