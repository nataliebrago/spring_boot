package homework30.patterns_simpleFactory;
public class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Завариваю чай: кладу пакетик чая в чашку с кипятком.");
    }
    @Override
    public void drink() {
        System.out.println("Пью чай: расслабляет и согревает.");
    }
}