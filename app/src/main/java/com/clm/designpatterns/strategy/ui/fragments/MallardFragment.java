package com.clm.designpatterns.strategy.ui.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.clm.designpatterns.R;
import com.clm.designpatterns.strategy.ducks.MallardDuck;
import com.clm.designpatterns.strategy.ducks.behaviors.FlyWithWings;
import com.clm.designpatterns.util.MediaPlayerUtil;

import butterknife.OnClick;

public class MallardFragment extends BaseDuckFragment {
    private MediaPlayerUtil mediaPlayerUtil;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(duck == null) {
            duck = new MallardDuck(mediaPlayerUtil,
                    getActivity().findViewById(R.id.duck_image_view),
                    getActivity());
        }
        displayDuck();
    }

    public void setMediaPlayerUtil(MediaPlayerUtil mediaPlayerUtil){
        this.mediaPlayerUtil = mediaPlayerUtil;
    }

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
