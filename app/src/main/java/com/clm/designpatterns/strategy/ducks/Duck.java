package com.clm.designpatterns.strategy.ducks;

import com.clm.designpatterns.strategy.ducks.behaviors.FlyingBehavior;
import com.clm.designpatterns.strategy.ducks.behaviors.QuackingBehavior;

public abstract class BaseDuck {
    FlyingBehavior flyingBehavior;
    QuackingBehavior quackingBehavior;

    public void performFly(){
        flyingBehavior.fly();
    }

    public void performQuack(){
        quackingBehavior.quack();
    }

    public abstract void swim();

    public abstract void display();
}
