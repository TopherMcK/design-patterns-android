package com.clm.designpatterns.strategy.behaviors;

import com.clm.designpatterns.R;
import com.clm.designpatterns.util.MediaPlayerUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SqueakTest {
    @Mock
    private MediaPlayerUtil mediaPlayerUtil;

    private QuackingBehavior testSqueak;

    @Test
    public void whenQuackIsCalledAndMediaPlayerIsNotNullThenPlaysFile(){
        testSqueak = new Squeak(mediaPlayerUtil);
        testSqueak.quack();
        verify(mediaPlayerUtil).playFile(R.raw.squeak);
    }
}
