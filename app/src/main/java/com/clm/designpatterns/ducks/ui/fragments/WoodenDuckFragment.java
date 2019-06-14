package com.clm.designpatterns.ducks.ui.fragments;

import com.clm.designpatterns.R;
import com.clm.designpatterns.ducks.behaviors.FlyNoWay;
import com.clm.designpatterns.ducks.behaviors.MuteQuack;

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
