package com.clm.designpatterns.strategy.ui.fragments;

import android.view.View;

import com.clm.designpatterns.R;

import butterknife.OnClick;

public class MallardFragment extends BaseDuckFragment {

    @Override
    protected int layoutRes() {
        return R.layout.mallard_duck;
    }

    @OnClick({R.id.fly_btn, R.id.quack_btn, R.id.swim_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fly_btn:
                performFly();
                break;
            case R.id.quack_btn:
                performQuack();
                break;
            case R.id.swim_btn:
                performSwim();
                break;
            default:
                // Do nothing
        }
    }
}
