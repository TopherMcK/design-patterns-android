package com.clm.designpatterns.strategy.ducks;

import com.clm.designpatterns.strategy.ducks.behaviors.FlyingBehavior;
import com.clm.designpatterns.strategy.ducks.behaviors.QuackingBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(FlyingBehavior flyingBehavior,
                      QuackingBehavior quackingBehavior){
        super(flyingBehavior, quackingBehavior);
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {

    }
}
