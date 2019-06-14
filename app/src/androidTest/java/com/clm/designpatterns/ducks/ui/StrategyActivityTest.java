package com.clm.designpatterns.ducks.ui;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import com.clm.designpatterns.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class StrategyActivityTest {
    @Rule
    public ActivityTestRule<StrategyActivity> testRule = new ActivityTestRule(StrategyActivity.class, false, false);

    private StrategyActivity testActivity;

    @Before
    public void setup(){
        testActivity = testRule.launchActivity(new Intent());
    }

    @Test
    public void whenActivityIsLaunchedThenLayoutResIsActivityStrategy(){
        int expectedLayoutRes = R.layout.activity_strategy;
        int actualRes = testActivity.layoutRes();
        assertEquals(expectedLayoutRes, actualRes);
    }

    @Test
    public void whenTabLayoutIsCreatedThenCreatesFourTabs(){
        int expectedTabCount = 4;
        int actualTabCount = testActivity.tabLayout.getTabCount();
        assertEquals(expectedTabCount, actualTabCount);
    }
}
