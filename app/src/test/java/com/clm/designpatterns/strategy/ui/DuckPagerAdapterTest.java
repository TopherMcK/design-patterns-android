package com.clm.designpatterns.strategy.ui;

import android.content.Context;
import android.support.v4.app.FragmentManager;

import com.clm.designpatterns.strategy.ui.fragments.MallardFragment;
import com.clm.designpatterns.strategy.ui.fragments.RedheadFragment;
import com.clm.designpatterns.strategy.ui.fragments.RubberDuckFragment;
import com.clm.designpatterns.strategy.ui.fragments.WoodenDuckFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import dagger.android.support.DaggerAppCompatActivity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class DuckPagerAdapterTest {
    @Mock
    private FragmentManager fragmentManager;
    @Mock
    private DaggerAppCompatActivity activity;

    private DuckPagerAdapter testAdapter;

    @Before
    public void setup(){
        testAdapter = new DuckPagerAdapter(fragmentManager, activity);
    }

    @Test
    public void whenGetCountIsCalledThenReturnsFour(){
        int expectedCount = 4;
        int actualCount = testAdapter.getCount();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void whenGetItemIsCalledAndPositionIsZeroThenReturnsMallardFragment(){
        assertTrue(testAdapter.getItem(0) instanceof MallardFragment);
    }

    @Test
    public void whenGetItemIsCalledAndPositionIsOneThenReturnsRedheadFragment(){
        assertTrue(testAdapter.getItem(1) instanceof RedheadFragment);
    }

    @Test
    public void whenGetItemIsCalledAndPositionIsTwoThenReturnsRubberDuckFragment(){
        assertTrue(testAdapter.getItem(2) instanceof RubberDuckFragment);
    }

    @Test
    public void whenGetItemIsCalledAndPositionIsThreeThenReturnsWoodenDuckFragment(){
        assertTrue(testAdapter.getItem(3) instanceof WoodenDuckFragment);
    }
}
