package com.clm.designpatterns.strategy.behaviors;

import com.clm.designpatterns.util.MediaPlayerUtil;

public class Quack implements QuackingBehavior {
    private MediaPlayerUtil mediaPlayerUtil;
    private int quackSoundResource;

    public Quack(MediaPlayerUtil mediaPlayerUtil, int quackSoundResource){
        this.mediaPlayerUtil = mediaPlayerUtil;
        this.quackSoundResource = quackSoundResource;
    }

    @Override
    public void quack() {
        if(mediaPlayerUtil != null){
            mediaPlayerUtil.playFile(quackSoundResource);
        }
    }
}
