package com.clm.designpatterns.ducks.ui.fragments;

import com.clm.designpatterns.R;
import com.clm.designpatterns.ducks.behaviors.FlyWithWings;
import com.clm.designpatterns.ducks.behaviors.Quack;

public class RedheadFragment extends BaseDuckFragment {

    @Override
    void setupBehaviors() {
        flyingBehavior = new FlyWithWings(duckImageView);
        quackingBehavior = new Quack(mediaPlayerUtil, R.raw.redhead_duck);
    }

    @Override
    int imageResource() {
        return R.drawable.redhead_duck;
    }
}
