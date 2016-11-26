package ch2Obeserver.SelfObserver;

import ch2Obeserver.SelfObserver.inter.DisplayElement;
import ch2Obeserver.SelfObserver.inter.Observer;
import ch2Obeserver.SelfObserver.inter.Subject;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
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

    public void update(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
