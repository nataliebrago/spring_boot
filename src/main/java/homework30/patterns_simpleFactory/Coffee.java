package homework30.patterns_simpleFactory;

public class Coffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Завариваю кофе: добавляю молотые зёрна в кофе-машину.");
    }
    @Override
    public void drink() {
        System.out.println("Пью кофе: горячий и бодрящий!");
    }
}
