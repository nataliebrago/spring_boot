package homework30.patterns_factoryMethod;

/**Шаг 2: Создадим конкретные продукты*/
public class AmericanCoffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Завариваю американский кофе: чёрный, без сахара.");
    }
    @Override
    public void drink() {
        System.out.println("Пью кофе: крепкий и простой.");
    }
}