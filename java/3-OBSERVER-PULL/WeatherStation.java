public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(70, 65, 20.6f);
        weatherData.setMeasurements(50, 60, 22.6f);
        weatherData.setMeasurements(62, 77, 35.6f);
    }
}