package com.clm.designpatterns.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Singleton;

import timber.log.Timber;

@Singleton
public class DesignPatternsActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private Activity currentActivity;

    @Inject
    public DesignPatternsActivityLifecycleListener(){}

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        this.currentActivity = activity;
        Timber.d("@@@ Current activity %s", activity.getClass().getSimpleName());
    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }

    public Activity getCurrentActivity(){
        return currentActivity;
    }
}
