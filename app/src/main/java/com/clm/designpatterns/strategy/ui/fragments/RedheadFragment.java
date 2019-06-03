package com.clm.designpatterns.strategy.ui.fragments;

import android.os.Bundle;

import com.clm.designpatterns.strategy.ducks.RedheadDuck;

public class RedheadFragment extends BaseDuckFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        duck = new RedheadDuck(mediaPlayerUtil,
                duckImageView,
                getActivity());

        displayDuck();
    }
}
