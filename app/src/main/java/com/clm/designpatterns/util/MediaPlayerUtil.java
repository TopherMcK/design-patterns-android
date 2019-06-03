package com.clm.designpatterns.util;

import android.content.Context;
import android.media.MediaPlayer;

import java.io.IOException;

import javax.inject.Inject;

import timber.log.Timber;

public class MediaPlayerUtil {
    private Context appContext;
    private MediaPlayer mediaPlayer;

    @Inject
    public MediaPlayerUtil(Context appContext){
        this.appContext = appContext;
        mediaPlayer = new MediaPlayer();
    }

    public void playFile(int soundFileId){
        loadFile(soundFileId);
        mediaPlayer.setOnCompletionListener(mp -> mediaPlayer.reset());
        mediaPlayer.start();
    }

    private void loadFile(int soundFileId){
        try {
            mediaPlayer.setDataSource(
                    appContext.getResources().openRawResourceFd(soundFileId)
            );
            mediaPlayer.prepare();
        } catch (IOException e) {
            Timber.e(e, "Error loading sound file : %s", e.getMessage());
        }
    }
}
