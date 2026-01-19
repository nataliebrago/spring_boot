package homework31.observer;

public interface TemperatureSubject {
    void registerObserver(TemperatureObserver observer);
    void removeObserver(TemperatureObserver observer);
    void notifyObservers();
}