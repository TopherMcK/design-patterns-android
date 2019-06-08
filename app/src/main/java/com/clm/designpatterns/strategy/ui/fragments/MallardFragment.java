package com.clm.designpatterns.strategy.ui.fragments;

import com.clm.designpatterns.R;
import com.clm.designpatterns.strategy.behaviors.FlyWithWings;
import com.clm.designpatterns.strategy.behaviors.Quack;

public class MallardFragment extends BaseDuckFragment {

    @Override
    void setupBehaviors() {
        flyingBehavior = new FlyWithWings(duckImageView);
        quackingBehavior = new Quack(mediaPlayerUtil, R.raw.mallard);
    }

    @Override
    int imageResource() {
        return R.drawable.mallard;
    }
}
