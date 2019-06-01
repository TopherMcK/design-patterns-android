package com.clm.designpatterns.strategy.ducks;

import com.clm.designpatterns.strategy.ducks.behaviors.FlyNoWay;
import com.clm.designpatterns.strategy.ducks.behaviors.Squeak;

public class RubberDuck extends BaseDuck {

    public RubberDuck(){
        flyingBehavior = new FlyNoWay();
        quackingBehavior = new Squeak();
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {

    }
}
