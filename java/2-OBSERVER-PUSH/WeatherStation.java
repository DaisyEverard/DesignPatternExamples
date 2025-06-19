public class WeatherStation {
    public static void main(String[] args) {
        WeatherDataPush weatherData = new WeatherDataPush();

        CurrentConditionsDisplayPush currentDisplay = new CurrentConditionsDisplayPush(weatherData);
        ForecastDisplayPush forecastDisplay = new ForecastDisplayPush(weatherData);

        weatherData.setMeasurements(70, 65, 20.6f);
        weatherData.setMeasurements(50, 60, 22.6f);
        weatherData.setMeasurements(62, 77, 35.6f);
    }
}