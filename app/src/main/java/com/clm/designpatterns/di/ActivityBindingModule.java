package com.clm.designpatterns.di;

import com.clm.designpatterns.landing.LandingActivity;
import com.clm.designpatterns.strategy.StrategyActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract LandingActivity bindLandingActivity();

    @ContributesAndroidInjector
    abstract StrategyActivity bindStrategyActivity();
}
