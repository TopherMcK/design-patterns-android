package com.clm.designpatterns.strategy.ducks.behaviors;

import timber.log.Timber;

public class Quack implements QuackingBehavior {
    @Override
    public void quack() {
        Timber.d("Quack!");
    }
}
