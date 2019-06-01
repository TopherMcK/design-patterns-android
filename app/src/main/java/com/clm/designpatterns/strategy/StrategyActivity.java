package com.clm.designpatterns.strategy;

import com.clm.designpatterns.R;
import com.clm.designpatterns.base.BaseActivity;
import com.clm.designpatterns.lifecycle.DesignPatternsActivityLifecycleListener;

import javax.inject.Inject;

public class StrategyActivity extends BaseActivity {

    @Inject
    DesignPatternsActivityLifecycleListener lifecycleListener;

    @Override
    protected DesignPatternsActivityLifecycleListener lifecycleListener(){
        return lifecycleListener;
    }

    @Override
    protected int layoutRes() {
       return R.layout.activity_landing;
    }
}
