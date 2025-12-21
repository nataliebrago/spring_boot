package homework30.patterns_factoryMethod;

/**5: Использование в клиенте*/
public class Client {
    public static void main(String[] args) {
        BeverageShop shop1 = new AmericanCoffeeShop();
        shop1.serveCustomer();

        BeverageShop shop2 = new EnglishTeaShop();
        shop2.serveCustomer();
    }
}