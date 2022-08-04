package chapter2;

public class WeatherStation {

    public  static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currnetDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMesurements(80, 65,30.4f);
        weatherData.setMesurements(14, 70,30.4f);
        weatherData.setMesurements(74, 61,30.4f);

    }
}
