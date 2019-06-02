package com.clm.designpatterns.strategy.ducks.behaviors;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;

import timber.log.Timber;

public class FlyWithWings implements FlyingBehavior {
    private ImageView duckImageView;

    public FlyWithWings(){}

    public FlyWithWings(ImageView duckImageView){
        this.duckImageView = duckImageView;
    }

    @Override
    public void fly() {
        Timber.i("Flying...");
        ObjectAnimator animation = ObjectAnimator.ofFloat(duckImageView, "translationY", 100f);
        animation.setDuration(2000);
        animation.start();
    }
}
