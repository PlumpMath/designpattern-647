package ch2Obeserver.JavaAPIObserver;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class WeatherData extends Observable {

    private Double temperature;
    private Double humidity;
    private Double pressure;

    public WeatherData() {
    }


    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    // 修改原来的push数据的方式变成现在的pull数据的方式，观察者需要那些数据，可以从Observable进行getter


    public Double getTemperature() {
        return temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }
}
