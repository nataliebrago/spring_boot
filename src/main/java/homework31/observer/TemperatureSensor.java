package homework31.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements TemperatureSubject {
    private List<TemperatureObserver> observers = new ArrayList<>();
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers(); // оповещение при изменении
    }

    @Override
    public void registerObserver(TemperatureObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TemperatureObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TemperatureObserver o : observers) {
            o.updateTemperature(temperature);
        }
    }
}