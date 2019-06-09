package com.clm.designpatterns.command.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.clm.designpatterns.receivers.P2PReceiver;

public class CommandViewModel extends AndroidViewModel {
    private Application application;
    private P2PReceiver p2PReceiver;

    public CommandViewModel(@NonNull Application application) {
        super(application);
        this.application = application;
        p2PReceiver = new P2PReceiver();
        application.registerReceiver(p2PReceiver, P2PReceiver.getP2PReceiverIntentFilter());
    }

    protected void onCleared() {
        if(p2PReceiver != null) {
            application.unregisterReceiver(p2PReceiver);
            p2PReceiver = null;
        }
    }
}
