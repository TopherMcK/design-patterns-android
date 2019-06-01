package com.clm.designpatterns;

import com.clm.designpatterns.di.DaggerDesignPatternsApplicationComponent;
import com.clm.designpatterns.di.DesignPatternsApplicationComponent;
import com.clm.designpatterns.lifecycle.DesignPatternsActivityLifecycleListener;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import timber.log.Timber;

public class DesignPatternsApplication extends DaggerApplication {
    @Inject
    DesignPatternsActivityLifecycleListener lifecycleListener;

    @Override
    public void onCreate(){
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        DesignPatternsApplicationComponent applicationComponent = DaggerDesignPatternsApplicationComponent.builder().application(this).build();
        applicationComponent.inject(this);
        registerActivityLifecycleCallbacks(lifecycleListener);
        return applicationComponent;
    }
}
