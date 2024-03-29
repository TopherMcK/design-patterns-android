package com.clm.designpatterns.strategy.behaviors;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.widget.ImageView;

import org.jetbrains.annotations.TestOnly;

import timber.log.Timber;

public class FlyWithWings implements FlyingBehavior {
    private ImageView duckImageView;
    private ObjectAnimator animation;

    public FlyWithWings(ImageView duckImageView){
        this.duckImageView = duckImageView;
        setupAnimation();
    }

    @TestOnly
    FlyWithWings(ImageView duckImageView, ObjectAnimator animation){
        this.duckImageView = duckImageView;
        this.animation = animation;
    }

    @Override
    public void fly() {
        Timber.d("Flying...");
        if(isOkayToStartAnimation()) {
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

    private void setupAnimation(){
        if(duckImageView != null) {
            animation = ObjectAnimator.ofFloat(duckImageView, "translationY", -90f);
            animation.setDuration(1000);
        }
    }

    private boolean isOkayToStartAnimation(){
        return duckImageView != null && animation != null && !animation.isRunning();
    }
}
