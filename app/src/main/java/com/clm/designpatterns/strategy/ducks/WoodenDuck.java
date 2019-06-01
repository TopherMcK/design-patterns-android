package com.clm.designpatterns.strategy.ducks;

import com.clm.designpatterns.strategy.ducks.behaviors.FlyNoWay;
import com.clm.designpatterns.strategy.ducks.behaviors.MuteQuack;

public class WoodenDuck extends BaseDuck {

    public WoodenDuck(){
        flyingBehavior = new FlyNoWay();
        quackingBehavior = new MuteQuack();
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {

    }
}
