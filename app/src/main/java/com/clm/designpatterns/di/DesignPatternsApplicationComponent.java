package com.clm.designpatterns.di;

import android.app.Application;

import com.clm.designpatterns.DesignPatternsApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class,
        ContextModule.class
})
public interface DesignPatternsApplicationComponent extends AndroidInjector {

    void inject(DesignPatternsApplication application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        DesignPatternsApplicationComponent build();
    }
}
