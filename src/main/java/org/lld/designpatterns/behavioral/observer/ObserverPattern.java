package org.lld.designpatterns.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temp);
}

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

class WeatherStationIn implements Subject {
    private float temperature;
    private List<Observer> observers;

    public WeatherStationIn() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);       //Run time polymorphism
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}


class DisplayDeviceIn implements Observer {
    private String name;
    public DisplayDeviceIn(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp) {
        System.out.println("Display device " + name + " temperature: " + temp);
    }
}


class MobileDevice implements Observer {

    @Override
    public void update(float temp) {
        System.out.println("MobileDevice temperature: " + temp);
    }
}


public class ObserverPattern {
    public static void main(String[] args) {
        //Create a Publisher
        WeatherStationIn weatherStationIn = new WeatherStationIn();

        //Create subscribers
        DisplayDeviceIn device = new DisplayDeviceIn("SamsungLCD");
        MobileDevice mobileDevice = new MobileDevice();

        //Attach
        weatherStationIn.attach(device);
        weatherStationIn.attach(mobileDevice);

        //Set Temp
        weatherStationIn.setTemperature(25);

        //Detach
        weatherStationIn.detach(mobileDevice);

        weatherStationIn.setTemperature(26);

    }
}


