package com.clm.designpatterns.strategy.ducks;

import com.clm.designpatterns.strategy.ducks.behaviors.FlyWithWings;
import com.clm.designpatterns.strategy.ducks.behaviors.FlyingBehavior;
import com.clm.designpatterns.strategy.ducks.behaviors.Quack;

public class MallardDuck extends BaseDuck {

    public MallardDuck(){
        flyingBehavior = new FlyWithWings();
        quackingBehavior = new Quack();
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {

    }
}
