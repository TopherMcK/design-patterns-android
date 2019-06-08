package com.clm.designpatterns.strategy.behaviors;

import com.clm.designpatterns.R;
import com.clm.designpatterns.util.MediaPlayerUtil;

public class Squeak implements QuackingBehavior {
    private MediaPlayerUtil mediaPlayerUtil;

    public Squeak(MediaPlayerUtil mediaPlayerUtil) {
        this.mediaPlayerUtil = mediaPlayerUtil;
    }

    @Override
    public void quack() {
        if(mediaPlayerUtil != null){
            mediaPlayerUtil.playFile(R.raw.squeak);
        }
    }
}
