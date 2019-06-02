package com.clm.designpatterns.strategy.ducks;

import android.widget.ImageView;

import com.clm.designpatterns.strategy.ducks.behaviors.FlyingBehavior;
import com.clm.designpatterns.strategy.ducks.behaviors.QuackingBehavior;

public abstract class Duck {
    FlyingBehavior flyingBehavior;
    QuackingBehavior quackingBehavior;

    public Duck(){};

    public Duck(FlyingBehavior flyingBehavior,
            QuackingBehavior quackingBehavior) {
        this.flyingBehavior = flyingBehavior;
        this.quackingBehavior = quackingBehavior;
    }

    public void performFly(){
        flyingBehavior.fly();
    }

    public void performQuack(){
        quackingBehavior.quack();
    }

    public abstract void swim();

    public abstract void display();

    public abstract void display(ImageView imageView);
}
