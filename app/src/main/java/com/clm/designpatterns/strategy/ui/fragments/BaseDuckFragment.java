package com.clm.designpatterns.strategy.ui.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ImageView;

import com.clm.designpatterns.R;
import com.clm.designpatterns.base.BaseFragment;
import com.clm.designpatterns.strategy.ducks.Duck;

import timber.log.Timber;

public abstract class BaseDuckFragment extends BaseFragment {
    private Duck duck;
    private ImageView imageView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(duck != null) {
            Timber.d("@@@ displaying in onAttach");
            imageView = this.getBaseActivity().findViewById(R.id.duck_image_view);
            duck.display(imageView, 0);
        }
    }

    public void setDuck(Duck duck){
        this.duck = duck;
        if(this.isAdded()){
            Timber.d("@@@ displaying in set");
            duck.display();
        }
    }

    void performFly(){
        duck.performFly();
        ObjectAnimator animation = ObjectAnimator.ofFloat(imageView, "translationY", -100f);
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

    void performQuack(){
        duck.performQuack();
    }

    void displayDuck(ImageView imageView, int imageResId){
        duck.display(imageView, imageResId);
    }

    void performSwim(){
        duck.swim();
    }
}
