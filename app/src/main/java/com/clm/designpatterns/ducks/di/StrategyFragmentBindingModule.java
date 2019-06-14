package com.clm.designpatterns.ducks.di;

import com.clm.designpatterns.ducks.ui.fragments.MallardFragment;
import com.clm.designpatterns.ducks.ui.fragments.RedheadFragment;
import com.clm.designpatterns.ducks.ui.fragments.RubberDuckFragment;
import com.clm.designpatterns.ducks.ui.fragments.WoodenDuckFragment;

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
