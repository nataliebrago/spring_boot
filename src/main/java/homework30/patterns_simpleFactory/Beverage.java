package homework30.patterns_simpleFactory;

/**Интерфейс продукта (абстрактный напиток). Это общий интерфейс для всех напитков.*/
public interface Beverage {
    void prepare();
    void drink();
}
