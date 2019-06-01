package com.clm.designpatterns.strategy.di;

import com.clm.designpatterns.strategy.ui.fragments.MallardFragment;
import com.clm.designpatterns.strategy.ui.fragments.RedheadFragment;
import com.clm.designpatterns.strategy.ui.fragments.RubberDuckFragment;
import com.clm.designpatterns.strategy.ui.fragments.WoodenDuckFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class StrategyFragmentBindingModule {
    @ContributesAndroidInjector
    abstract MallardFragment bindingMallardFragment();

    @ContributesAndroidInjector
    abstract RedheadFragment bindingRedheadFragment();

    @ContributesAndroidInjector
    abstract RubberDuckFragment bindingRubberDuckFragment();

    @ContributesAndroidInjector
    abstract WoodenDuckFragment bindingWoodenDuckFragment();
}
