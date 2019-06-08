package com.clm.designpatterns.landing;

import android.os.Bundle;
import android.view.View;

import com.clm.designpatterns.R;
import com.clm.designpatterns.base.BaseActivity;
import com.clm.designpatterns.lifecycle.DesignPatternsActivityLifecycleListener;
import com.clm.designpatterns.strategy.ui.StrategyActivity;

import javax.inject.Inject;

import butterknife.OnClick;

public class LandingActivity extends BaseActivity {

    @Inject
    DesignPatternsActivityLifecycleListener lifecycleListener;

    @Override
    protected DesignPatternsActivityLifecycleListener lifecycleListener() {
        return lifecycleListener;
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_landing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick({R.id.duckBtn, R.id.weatherBtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.duckBtn:
                launchPatternActivity(StrategyActivity.class);
                break;
            case R.id.weatherBtn:
                break;
        }
    }
}
