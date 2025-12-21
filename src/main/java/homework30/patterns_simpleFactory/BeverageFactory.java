package homework30.patterns_simpleFactory;
//Простая фабрика
public class BeverageFactory {
    public static Beverage createBeverage(String type){
        //Логика выбора продукта по типу
        switch (type.toLowerCase()){
            case "coffee":
                return new Coffee();
            case "tea":
                return new Tea();
            default:
                throw new IllegalArgumentException("Неизвестный тип напитка: " + type + ". Доступные: coffee, tea.");
        }
    }
}