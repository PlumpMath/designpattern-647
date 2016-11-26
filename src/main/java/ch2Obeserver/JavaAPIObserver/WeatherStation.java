package ch2Obeserver.JavaAPIObserver;


/**
 * Created by zhangzj on 2016/11/26.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(15.23, 62.3, 100.1);
        weatherData.setMeasurements(21.45, 45.3, 101.2);
        weatherData.setMeasurements(39.84, 56.3, 90.99);
    }
}
