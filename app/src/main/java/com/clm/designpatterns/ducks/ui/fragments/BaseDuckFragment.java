package com.clm.designpatterns.ducks.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.clm.designpatterns.R;
import com.clm.designpatterns.base.BaseFragment;
import com.clm.designpatterns.ducks.behaviors.FlyingBehavior;
import com.clm.designpatterns.ducks.behaviors.QuackingBehavior;
import com.clm.designpatterns.util.MediaPlayerUtil;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public abstract class BaseDuckFragment extends BaseFragment {
    @Inject
    MediaPlayerUtil mediaPlayerUtil;

    @BindView(R.id.fly_btn)
    Button flyBtn;
    @BindView(R.id.quack_btn)
    Button quackBtn;
    @BindView(R.id.swim_btn)
    Button swimBtn;

    ImageView duckImageView;
    FlyingBehavior flyingBehavior;
    QuackingBehavior quackingBehavior;

    private View view;

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
        setupBehaviors();
        displayDuck();
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
                swim();
                break;
            default:
                // Do nothing
        }
    }

    abstract void setupBehaviors();

    abstract int imageResource();

    void displayDuck() {
        if (duckImageView != null) {
            duckImageView.setImageDrawable(getActivity().getDrawable(imageResource()));
        }
    }

    private void performFly() {
        if (flyingBehavior != null) {
            flyingBehavior.fly();
        }
    }

    private void performQuack() {
        if (quackingBehavior != null) {
            quackingBehavior.quack();
        }
    }

    private void swim() {
        if (mediaPlayerUtil != null) {
            mediaPlayerUtil.playFile(R.raw.swim_splash);
        }
    }
}
