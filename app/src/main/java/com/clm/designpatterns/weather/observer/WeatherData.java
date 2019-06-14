package com.clm.designpatterns.weather.observer;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherSubject {
    private List<WeatherObserver> observers;
    private float humidity;
    private float pressure;
    private float temperature;
    private static WeatherData INSTANCE;

    private WeatherData(){
        observers = new ArrayList<>();
    }

    public static WeatherData getInstance(){
        if(INSTANCE == null){
            INSTANCE = new WeatherData();
        }
        return INSTANCE;
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        if(!hasInstanceOfObserver(weatherObserver)){
            observers.add(weatherObserver);
        }
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        if(hasInstanceOfObserver(weatherObserver)){
            observers.remove(weatherObserver);
        }
    }

    @Override
    public void removeAllObservers() {
        if(CollectionUtils.isNotEmpty(observers)){
            observers.clear();
        }
    }

    @Override
    public void notifyObservers() {
        if(CollectionUtils.isNotEmpty(observers)) {
            for (int i = 0; i < observers.size(); i++){
                WeatherObserver weatherObserver = observers.get(i);
                weatherObserver.update(temperature, humidity, pressure);
            }
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        if(measurementsHaveChanged(temperature, humidity, pressure)) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
            notifyObservers();
        }
    }

    private boolean measurementsHaveChanged(float temperature, float humidity, float pressure){
        return this.temperature != temperature
                || this.humidity != humidity
                || this.pressure != pressure;
    }

    private boolean hasInstanceOfObserver(WeatherObserver weatherObserver){
        return CollectionUtils.isNotEmpty(observers) && observers.contains(weatherObserver);
    }
}
