package com.clm.designpatterns.strategy.ducks.behaviors;

import timber.log.Timber;

public class FlyWithWings implements FlyingBehavior {
    @Override
    public void fly() {
        Timber.i("Flying...");
    }
}
