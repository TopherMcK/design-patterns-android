package com.clm.designpatterns.strategy.behaviors;

import timber.log.Timber;

public class FlyNoWay implements FlyingBehavior {
    @Override
    public void fly() {
        Timber.i("Cannot fly");
    }
}
