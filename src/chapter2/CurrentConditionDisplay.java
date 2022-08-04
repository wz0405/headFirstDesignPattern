package chapter2;

public class CurrentConditionDisplay implements Observer, DisplayElement{

    private  float temperature;
    private  float humidity;
    private  WeatherData weatherData;
    public  CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("현재상태: 온도 "+ temperature +"C, 습도 "+ humidity+"%");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity =humidity;
        display();
    }
}
