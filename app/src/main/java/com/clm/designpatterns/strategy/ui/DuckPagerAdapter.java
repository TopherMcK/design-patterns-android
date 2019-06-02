package com.clm.designpatterns.strategy.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.clm.designpatterns.R;
import com.clm.designpatterns.strategy.ducks.Duck;
import com.clm.designpatterns.strategy.ducks.MallardDuck;
import com.clm.designpatterns.strategy.ducks.RedheadDuck;
import com.clm.designpatterns.strategy.ducks.RubberDuck;
import com.clm.designpatterns.strategy.ducks.WoodenDuck;
import com.clm.designpatterns.strategy.ui.fragments.BaseDuckFragment;
import com.clm.designpatterns.strategy.ui.fragments.MallardFragment;
import com.clm.designpatterns.strategy.ui.fragments.RedheadFragment;
import com.clm.designpatterns.strategy.ui.fragments.RubberDuckFragment;
import com.clm.designpatterns.strategy.ui.fragments.WoodenDuckFragment;
import com.clm.designpatterns.util.MediaPlayerUtil;

import dagger.android.support.DaggerAppCompatActivity;

public class DuckPagerAdapter extends FragmentStatePagerAdapter {

    private DaggerAppCompatActivity parent;
    private MediaPlayerUtil mediaPlayerUtil;

    public DuckPagerAdapter(FragmentManager fragmentManager, DaggerAppCompatActivity parent, MediaPlayerUtil mediaPlayerUtil){
        super(fragmentManager);
        this.parent = parent;
        this.mediaPlayerUtil = mediaPlayerUtil;
    }

    @Override
    public Fragment getItem(int position) {
        BaseDuckFragment duckFragment = null;
        Duck duck = null;
        switch (position){
            case 0:
                duckFragment = new MallardFragment();
                mediaPlayerUtil.loadFile(R.raw.mallard);
                duck = new MallardDuck(mediaPlayerUtil,
                parent.findViewById(R.id.duck_image_view),
                        parent);
                break;
            case 1:
                duckFragment = new RedheadFragment();
                duck = new RedheadDuck();
                break;
            case 2:
                duckFragment = new RubberDuckFragment();
                duck = new RubberDuck();
                break;
            case 3:
                duckFragment = new WoodenDuckFragment();
                duck = new WoodenDuck();
                break;
            default:
                // Do nothing... Position doesn't exist.
        }
        if(duckFragment != null){
            duckFragment.setDuck(duck);
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
