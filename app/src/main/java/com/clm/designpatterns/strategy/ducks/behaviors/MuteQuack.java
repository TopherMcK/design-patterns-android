package com.clm.designpatterns.strategy.ducks.behaviors;

import timber.log.Timber;

public class MuteQuack implements QuackingBehavior {
    @Override
    public void quack() {
        Timber.i("I cannot quack...");
    }
}
