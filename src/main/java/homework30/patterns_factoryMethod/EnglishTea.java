package homework30.patterns_factoryMethod;
public class EnglishTea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Завариваю английский чай: с молоком и сахаром.");
    }
    @Override
    public void drink() {
        System.out.println("Пью чай: истинно британский.");
    }
}