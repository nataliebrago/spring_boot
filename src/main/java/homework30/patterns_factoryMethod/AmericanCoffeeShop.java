package homework30.patterns_factoryMethod;

/**Шаг 4: Создадим конкретных создателей*/
public class AmericanCoffeeShop extends BeverageShop {
    @Override
    protected Beverage createBeverage() {
        return new AmericanCoffee();  // Создаёт американский кофе
    }
}