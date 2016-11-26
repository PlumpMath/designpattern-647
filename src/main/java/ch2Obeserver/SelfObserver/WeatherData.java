package ch2Obeserver.SelfObserver;

import ch2Obeserver.SelfObserver.inter.Observer;
import ch2Obeserver.SelfObserver.inter.Subject;

import java.util.ArrayList;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private Double temperature;
    private Double humidity;
    private Double pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(Double temperature, Double humidity, Double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
