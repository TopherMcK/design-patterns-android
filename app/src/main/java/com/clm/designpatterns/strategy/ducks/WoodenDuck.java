package com.clm.designpatterns.strategy.ducks;

import android.widget.ImageView;

import com.clm.designpatterns.strategy.ducks.behaviors.FlyNoWay;
import com.clm.designpatterns.strategy.ducks.behaviors.MuteQuack;

public class WoodenDuck extends Duck {

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

    @Override
    public void display(ImageView imageView) {

    }
}
