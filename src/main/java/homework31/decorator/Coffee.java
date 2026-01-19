package homework31.decorator;

public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 2.0; // базовая цена кофе
    }
}