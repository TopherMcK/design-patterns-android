package com.clm.designpatterns.weather.observer;

public interface WeatherSubject {
    void registerObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void removeAllObservers();
    void notifyObservers();
}
