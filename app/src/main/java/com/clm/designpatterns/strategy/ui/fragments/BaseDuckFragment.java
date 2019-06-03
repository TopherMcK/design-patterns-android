package com.clm.designpatterns.strategy.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.clm.designpatterns.R;
import com.clm.designpatterns.base.BaseFragment;
import com.clm.designpatterns.strategy.ducks.Duck;
import com.clm.designpatterns.util.MediaPlayerUtil;

import butterknife.OnClick;

public abstract class BaseDuckFragment extends BaseFragment {
    Duck duck;
    MediaPlayerUtil mediaPlayerUtil;
    ImageView duckImageView;
    View view;

    @Override
    protected int layoutRes() {
        return R.layout.fragment_content_duck;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        duckImageView = view.findViewById(R.id.duck_image_view);
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

    public void setMediaPlayerUtil(MediaPlayerUtil mediaPlayerUtil){
        this.mediaPlayerUtil = mediaPlayerUtil;
    }

    void displayDuck() {
        if (duck != null)
            duck.display();
    }

    void performFly() {
        if (duck != null)
            duck.performFly();
    }

    void performQuack() {
        if (duck != null)
            duck.performQuack();
    }

    void performSwim() {
        if (duck != null)
            duck.swim();
    }
}
