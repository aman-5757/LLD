package org.lld.designpatterns.behavioral.observer;

class DisplayDevice{
    public void showTemp(float temp){
        System.out.println("Current temp: " + temp + " C");
    }
}

class WeatherStation{
    private DisplayDevice displayDevice;    //can be multiple such device later on
    private float temp;

    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }

    public void setTemp(float temp){
        this.temp = temp;
        notifyDevice();
    }

    public void notifyDevice(){
        displayDevice.showTemp(temp);
    }

}



public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice displayDevice = new DisplayDevice();
        WeatherStation weatherStation = new WeatherStation(displayDevice);

        weatherStation.setTemp(10);
        weatherStation.setTemp(15);
    }
}
