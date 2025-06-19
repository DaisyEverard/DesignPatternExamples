import java.util.List;
import java.util.ArrayList;

public class WeatherData implements ISubject {
    private List<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<IObserver>();
    }

    public float getTemperature() {
        return this.temperature;
    }
    public float getHumidity() {
        return this.humidity;
    }
    public float getPressure() {
        return this.pressure;
    }

    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void notifiyObservers() {
        for (IObserver observer: observers) {
            observer.update();
            // removed data arguments to be pushed here
        }
    };

    public void measurementsChanged() {
        notifiyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    
} 
