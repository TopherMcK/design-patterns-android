package com.clm.designpatterns.strategy.ducks.behaviors;

import timber.log.Timber;

public class Squeak implements QuackingBehavior {
    @Override
    public void quack() {
        Timber.d("Squeak!");
    }
}
