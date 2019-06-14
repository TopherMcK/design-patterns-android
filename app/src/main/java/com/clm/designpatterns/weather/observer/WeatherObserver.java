package com.clm.designpatterns.weather.observer;

public interface WeatherObserver {
    void update(float temp, float humidity, float pressure);
}
