package com.clm.designpatterns.strategy.ducks;

import android.widget.ImageView;

import com.clm.designpatterns.strategy.ducks.behaviors.FlyNoWay;
import com.clm.designpatterns.strategy.ducks.behaviors.Squeak;

public class RubberDuck extends Duck {

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

    @Override
    public void display(ImageView imageView) {

    }
}
