package com.clm.designpatterns.ducks.behaviors;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.widget.ImageView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FlyWithWingsTest {
    @Mock
    private ImageView duckImageView;
    @Mock
    private ObjectAnimator animation;

    @Captor
    private ArgumentCaptor<AnimatorListenerAdapter> animatorListenerAdapterArgumentCaptor = ArgumentCaptor.forClass(AnimatorListenerAdapter.class);

    private FlyWithWings testBehavior;

    @Test
    public void whenFlyIsCalledAndImageViewIsNullThenDoesNotStartAnimation(){
        testBehavior = new FlyWithWings(null, animation);
        testBehavior.fly();
        verify(animation, never()).start();
    }

    @Test
    public void whenFlyIsCalledAndAnimationIsRunningThenDoesNotStartAnimation(){
        when(animation.isRunning()).thenReturn(true);
        testBehavior = new FlyWithWings(duckImageView, animation);
        testBehavior.fly();
        verify(animation, never()).start();
    }

    @Test
    public void whenFlyIsCalledAndIsOkayToStartTrueThenAddsListenerAndStartsAnimation(){
        testBehavior = new FlyWithWings(duckImageView, animation);
        testBehavior.fly();
        verify(animation).addListener(animatorListenerAdapterArgumentCaptor.capture());
        AnimatorListenerAdapter animatorListenerAdapter = animatorListenerAdapterArgumentCaptor.getValue();
        animatorListenerAdapter.onAnimationEnd(animation);
        verify(animation).removeListener(animatorListenerAdapter);
        verify(animation).reverse();
        verify(animation, times(2)).start();
    }
}
