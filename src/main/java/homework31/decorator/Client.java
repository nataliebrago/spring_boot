package homework31.decorator;

public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Coffee(); // базовый напиток
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        // добавляем молоко
        Beverage coffeeWithMilk = new Milk(coffee);
        System.out.println(coffeeWithMilk.getDescription() + " - $" + coffeeWithMilk.getCost());

        // добавляем сахар к уже с молоком
        Beverage fancyCoffee = new Sugar(coffeeWithMilk);
        System.out.println(fancyCoffee.getDescription() + " - $" + fancyCoffee.getCost());
    }
}