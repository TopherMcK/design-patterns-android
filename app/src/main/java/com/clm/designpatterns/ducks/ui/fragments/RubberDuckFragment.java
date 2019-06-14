package com.clm.designpatterns.ducks.ui.fragments;

import com.clm.designpatterns.R;
import com.clm.designpatterns.ducks.behaviors.FlyNoWay;
import com.clm.designpatterns.ducks.behaviors.Squeak;

public class RubberDuckFragment extends BaseDuckFragment {

    @Override
    void setupBehaviors() {
        flyingBehavior = new FlyNoWay();
        quackingBehavior = new Squeak(
                mediaPlayerUtil);
    }

    @Override
    int imageResource() {
        return R.drawable.rubber_duck_pic;
    }
}
