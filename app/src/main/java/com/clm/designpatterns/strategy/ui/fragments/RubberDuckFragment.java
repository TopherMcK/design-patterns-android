package com.clm.designpatterns.strategy.ui.fragments;

import com.clm.designpatterns.R;
import com.clm.designpatterns.strategy.behaviors.FlyNoWay;
import com.clm.designpatterns.strategy.behaviors.Squeak;

public class RubberDuckFragment extends BaseDuckFragment {

    @Override
    void setupBehaviors() {
        flyingBehavior = new FlyNoWay();
        quackingBehavior = new Squeak(
                mediaPlayerUtil,
                R.raw.squeak);
    }

    @Override
    int imageResource() {
        return R.drawable.rubber_duck_pic;
    }
}
