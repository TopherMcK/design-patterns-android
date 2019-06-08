package com.clm.designpatterns.strategy.behaviors;

import com.clm.designpatterns.util.MediaPlayerUtil;

public class Squeak implements QuackingBehavior {
    private MediaPlayerUtil mediaPlayerUtil;
    private int quackSoundResource;

    public Squeak(MediaPlayerUtil mediaPlayerUtil, int quackSoundResource) {
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
