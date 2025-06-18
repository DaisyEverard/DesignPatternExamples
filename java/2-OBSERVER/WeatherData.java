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

    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void notifiyObservers() {
        for (IObserver observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    };

    public void measurementsChanged() {
        // Called whenever a measurement has changed
        notifiyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    
} 
