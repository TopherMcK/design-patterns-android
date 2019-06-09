package com.clm.designpatterns.command.view;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import com.clm.designpatterns.R;
import com.clm.designpatterns.base.BaseActivity;
import com.clm.designpatterns.command.viewmodel.CommandViewModel;
import com.clm.designpatterns.command.viewmodel.CommandViewModelFactory;

import javax.inject.Inject;

public class CommandActivity extends BaseActivity {
    @Inject
    CommandViewModelFactory viewModelFactory;

    private CommandViewModel viewModel;

    @Override
    protected int layoutRes() {
        return R.layout.activity_command;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(CommandViewModel.class);
    }
}
