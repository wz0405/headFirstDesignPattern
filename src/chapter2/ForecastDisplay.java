package chapter2;

public class ForecastDisplay implements Observer, DisplayElement{
    private  WeatherData weatherData;
    private  float currentPressure = 29.92f;
    private float lastPressure;
    @Override
    public void display() {

    }
    public ForecastDisplay(WeatherData weatherData){

        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
