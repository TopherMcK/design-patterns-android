package com.clm.designpatterns.strategy.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.clm.designpatterns.R;
import com.clm.designpatterns.strategy.ui.fragments.MallardFragment;
import com.clm.designpatterns.strategy.ui.fragments.RedheadFragment;
import com.clm.designpatterns.strategy.ui.fragments.RubberDuckFragment;
import com.clm.designpatterns.strategy.ui.fragments.WoodenDuckFragment;

public class DuckPagerAdapter extends FragmentStatePagerAdapter {

    private Context context;

    public DuckPagerAdapter(FragmentManager fragmentManager, Context context){
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MallardFragment();
            case 1:
                return new RedheadFragment();
            case 2:
                return new RubberDuckFragment();
            case 3:
                return new WoodenDuckFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return context.getString(R.string.mallard_duck_label);
            case 1:
                return context.getString(R.string.redhead_duck_label);
            case 2:
                return context.getString(R.string.rubber_duck_label);
            case 3:
                return context.getString(R.string.wooden_duck_label);
            default:
                return null;
        }
    }
}
