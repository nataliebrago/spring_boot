package homework30.patterns_factoryMethod;

public class EnglishTeaShop extends BeverageShop {
    @Override
    protected Beverage createBeverage() {
        return new EnglishTea();
    }
}