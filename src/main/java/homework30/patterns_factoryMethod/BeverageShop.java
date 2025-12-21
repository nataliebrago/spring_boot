package homework30.patterns_factoryMethod;

/**Шаг 3: Создадим абстрактного создателя (фабрику)*/
public abstract class BeverageShop {
    protected abstract Beverage createBeverage();

    public void serveCustomer() {
        Beverage beverage = createBeverage();
        beverage.prepare();
        beverage.drink();
        System.out.println("Наслаждайтесь вашим напитком!\n");
    }
}