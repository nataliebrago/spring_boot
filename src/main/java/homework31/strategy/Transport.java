package homework31.strategy;

// Контекст
public class Transport {
    private TravelStrategy strategy;

    public Transport(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void move() {
        strategy.travel();
    }
}