import java.util.List;
import java.util.ArrayList;

public class WeatherDataPush implements ISubjectPush {
    private List<IObserverPush> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataPush() {
        observers = new ArrayList<IObserverPush>();
    }

    public void registerObserver(IObserverPush o) {
        observers.add(o);
    }

    public void removeObserver(IObserverPush o) {
        observers.remove(o);
    }

    public void notifiyObservers() {
        for (IObserverPush observer: observers) {
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
