package com.clm.designpatterns.strategy.ui.fragments;

import com.clm.designpatterns.base.BaseFragment;
import com.clm.designpatterns.strategy.ducks.Duck;

public abstract class BaseDuckFragment extends BaseFragment {
    Duck duck;

    void displayDuck() {
        if (duck != null)
            duck.display();
    }

    void performFly() {
        if (duck != null)
            duck.performFly();
    }

    void performQuack() {
        if (duck != null)
            duck.performQuack();
    }

    void performSwim() {
        if (duck != null)
            duck.swim();
    }
}
