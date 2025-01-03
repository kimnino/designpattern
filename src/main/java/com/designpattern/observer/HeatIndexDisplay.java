package com.designpattern.observer;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float heatIndex;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("체감온도는  " + heatIndex);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.heatIndex = temperature * humidity;
        display();
    }
}
