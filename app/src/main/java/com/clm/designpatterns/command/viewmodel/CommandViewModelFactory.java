package com.clm.designpatterns.command.viewmodel;

import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

public class CommandViewModelFactory implements ViewModelProvider.Factory {
    private final Application application;

    @Inject
    public CommandViewModelFactory(@NonNull Application application) {
        this.application = application;
    }


    @NonNull
    @Override
    public CommandViewModel create(@NonNull Class modelClass) {
        return new CommandViewModel(application);
    }
}
