package homework30.patterns_simpleFactory;
public class Client {
    public static void main(String[] args) {

        Beverage beverage1 = BeverageFactory.createBeverage("coffee");
        beverage1.prepare();
        beverage1.drink();

        Beverage beverage2 = BeverageFactory.createBeverage("tea");
        beverage2.prepare();
        beverage2.drink();

        try {
            Beverage invalid = BeverageFactory.createBeverage("soda");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}