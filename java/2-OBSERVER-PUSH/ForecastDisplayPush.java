
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForecastDisplayPush implements IObserverPush, IDisplayElement {
    private float humidity;
    private float pressure;
    private WeatherDataPush weatherData;

    private static final List<String> WEATHERS = Collections.unmodifiableList(
        Arrays.asList("rain", "sunny", "muggy", "cold", "snow", "hail", "drought", "flood", "raining frogs")
    );

    public ForecastDisplayPush(WeatherDataPush weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        int randomIndex = (int)(Math.random() * WEATHERS.size());
        String randomWeather = WEATHERS.get(randomIndex);

        System.out.println(this.humidity * this.pressure);
        System.out.println("The forecast is currently " + randomWeather);
    }

    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

}
