package homework31.strategy;

// Конкретные стратегии
public class CarStrategy implements TravelStrategy {
    public void travel() {
        System.out.println("Еду на автомобиле по дороге.");
    }
}