package com.clm.designpatterns.di;

import com.clm.designpatterns.command.view.CommandActivity;
import com.clm.designpatterns.landing.LandingActivity;
import com.clm.designpatterns.strategy.di.StrategyFragmentBindingModule;
import com.clm.designpatterns.strategy.ui.StrategyActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract LandingActivity bindLandingActivity();

    @ContributesAndroidInjector(modules = {
            StrategyFragmentBindingModule.class
    })
    abstract StrategyActivity bindStrategyActivity();

    @ContributesAndroidInjector
    abstract CommandActivity bindCommandActivity();
}
