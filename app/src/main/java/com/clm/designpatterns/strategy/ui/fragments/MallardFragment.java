package com.clm.designpatterns.strategy.ui.fragments;

import android.os.Bundle;

import com.clm.designpatterns.strategy.ducks.MallardDuck;

public class MallardFragment extends BaseDuckFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        duck = new MallardDuck(
                mediaPlayerUtil,
                duckImageView,
                getActivity());

        displayDuck();
    }
}
