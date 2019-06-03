package com.clm.designpatterns.strategy.ducks;

import android.content.Context;
import android.widget.ImageView;

import com.clm.designpatterns.R;
import com.clm.designpatterns.strategy.ducks.behaviors.FlyWithWings;
import com.clm.designpatterns.strategy.ducks.behaviors.Quack;
import com.clm.designpatterns.util.MediaPlayerUtil;

public class RedheadDuck extends Duck {
    private Context context;
    private MediaPlayerUtil mediaPlayerUtil;
    private ImageView redheadImageView;

    public RedheadDuck(MediaPlayerUtil mediaPlayerUtil, ImageView redheadImageView, Context context){
        super(new FlyWithWings(redheadImageView), new Quack(mediaPlayerUtil, R.raw.redhead_duck));
        this.mediaPlayerUtil = mediaPlayerUtil;
        this.redheadImageView = redheadImageView;
        this.context = context;
    }

    @Override
    public void swim() {
    }

    @Override
    public void display() {
        if(redheadImageView != null) {
            redheadImageView.setImageDrawable(context.getDrawable(R.drawable.redhead_duck));
        }
    }
}
