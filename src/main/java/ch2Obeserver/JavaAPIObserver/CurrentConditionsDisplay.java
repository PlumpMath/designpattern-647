package ch2Obeserver.JavaAPIObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", weatherData=" + weatherData +
                '}';
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", weatherData=" + weatherData +
                '}');
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData w = (WeatherData) o;
            this.temperature = w.getTemperature();
            this.humidity = w.getHumidity();
            this.pressure = w.getPressure();
            display();
        }
    }

//    public void update(Double temperature, Double humidity, Double pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        this.pressure = pressure;
//        display();
//    }
}
