public class CurrentConditionsDisplayPush implements IObserverPush, IDisplayElement {
    private float temperature;
    private float humidity;
    private WeatherDataPush weatherData;

    public CurrentConditionsDisplayPush(WeatherDataPush weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humditiy");
    }
}

