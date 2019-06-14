package com.clm.designpatterns.ducks.behaviors;

import com.clm.designpatterns.util.MediaPlayerUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class QuackTest {
    @Mock private MediaPlayerUtil mediaPlayerUtil;

    private QuackingBehavior testQuack;

    @Test
    public void whenQuackIsCalledAndMediaPlayerIsNotNullThenPlaysFile(){
        int expectedImageRes = 123;
        testQuack = new Quack(mediaPlayerUtil, expectedImageRes);
        testQuack.quack();
        verify(mediaPlayerUtil).playFile(expectedImageRes);
    }
}
