package com.clm.designpatterns.strategy.ducks.behaviors;

import com.clm.designpatterns.util.MediaPlayerUtil;

import timber.log.Timber;

public class Quack implements QuackingBehavior {
    private MediaPlayerUtil mediaPlayerUtil;
    public Quack(){}

    public Quack(MediaPlayerUtil mediaPlayerUtil){
        this.mediaPlayerUtil = mediaPlayerUtil;
    }

    @Override
    public void quack() {
        if(mediaPlayerUtil != null){
            mediaPlayerUtil.playFile();
        }
    }
}
