package ch2Obeserver.SelfObserver;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(85.23, 62.3, 100.1);
        weatherData.setMeasurements(90.45, 45.3, 101.2);
        weatherData.setMeasurements(79.84, 56.3, 90.99);
    }
}
