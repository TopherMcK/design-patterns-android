package com.clm.designpatterns.ducks.behaviors;

import timber.log.Timber;

public class FlyNoWay implements FlyingBehavior {
    @Override
    public void fly() {
        Timber.i("Cannot fly");
    }
}
