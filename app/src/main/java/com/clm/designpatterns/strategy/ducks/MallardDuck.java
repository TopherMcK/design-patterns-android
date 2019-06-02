package com.clm.designpatterns.strategy.ducks;

import android.content.Context;
import android.widget.ImageView;

import com.clm.designpatterns.R;
import com.clm.designpatterns.strategy.ducks.behaviors.FlyWithWings;
import com.clm.designpatterns.strategy.ducks.behaviors.Quack;
import com.clm.designpatterns.util.MediaPlayerUtil;

public class MallardDuck extends Duck {
    ImageView mallardImageView;
    Context context;

    public MallardDuck(MediaPlayerUtil mediaPlayerUtil, ImageView mallardImageView, Context context){
        super(new FlyWithWings(mallardImageView), new Quack(mediaPlayerUtil, R.raw.mallard));
        this.mallardImageView = mallardImageView;
        this.context = context;
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {
        if(mallardImageView != null) {
            mallardImageView.setImageDrawable(context.getDrawable(R.drawable.mallard));
        }
    }
}
