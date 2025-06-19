
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForecastDisplay implements IObserver, IDisplayElement {
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    private static final List<String> WEATHERS = Collections.unmodifiableList(
        Arrays.asList("rain", "sunny", "muggy", "cold", "snow", "hail", "drought", "flood", "raining frogs")
    );

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        int randomIndex = (int)(Math.random() * WEATHERS.size());
        String randomWeather = WEATHERS.get(randomIndex);

        System.out.println(this.humidity * this.pressure);
        System.out.println("The forecast is currently " + randomWeather);
    }

    public void update() {
        this.pressure = weatherData.getPressure();
        this.humidity = weatherData.getHumidity();
        display();
    }

}
