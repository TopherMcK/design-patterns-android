package com.clm.designpatterns.landing;

import android.os.Bundle;
import android.view.View;

import com.clm.designpatterns.R;
import com.clm.designpatterns.base.BaseActivity;
import com.clm.designpatterns.command.view.CommandActivity;
import com.clm.designpatterns.strategy.ui.StrategyActivity;

import butterknife.OnClick;
import timber.log.Timber;

public class LandingActivity extends BaseActivity {

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
            case  R.id.remoteBtn:
                launchPatternActivity(CommandActivity.class);
                break;
            default:
                Timber.w("Unknown button clicked.");
        }
    }
}
