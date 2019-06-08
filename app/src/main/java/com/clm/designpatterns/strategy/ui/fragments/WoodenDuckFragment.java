package com.clm.designpatterns.strategy.ui.fragments;

import com.clm.designpatterns.R;
import com.clm.designpatterns.strategy.behaviors.FlyNoWay;
import com.clm.designpatterns.strategy.behaviors.MuteQuack;

public class WoodenDuckFragment extends BaseDuckFragment {

    @Override
    void setupBehaviors() {
        flyingBehavior = new FlyNoWay();
        quackingBehavior = new MuteQuack();
    }

    @Override
    int imageResource() {
        return R.drawable.decoy_duck_pic;
    }
}
