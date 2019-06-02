package com.clm.designpatterns.strategy.ducks.behaviors;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
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
        if(duckImageView != null) {
            ObjectAnimator animation = ObjectAnimator.ofFloat(duckImageView, "translationY", -100f);
            animation.setDuration(1000);
            animation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    animation.removeListener(this);
                    ((ObjectAnimator) animation).reverse();
                    animation.start();
                }
            });
            animation.start();
        }
    }
}
