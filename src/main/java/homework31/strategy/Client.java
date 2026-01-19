package homework31.strategy;

// Демонстрация
public class Client {
    public static void main(String[] args) {
        Transport transport = new Transport(new CarStrategy());
        transport.move();  // Выведет: Еду на автомобиле по дороге.

        // Меняем стратегию — едем на велосипеде
        transport.setStrategy(new BicycleStrategy());
        transport.move();  // Выведет: Еду на велосипеде по парку.

        // Меняем стратегию — плывем на корабле
        transport.setStrategy(new ShipStrategy());
        transport.move();  // Выведет: Плаваю на корабле по морю.
    }
}