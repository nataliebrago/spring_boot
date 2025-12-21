package homework30.patterns_abstractFactory;

/**Шаг 2: Реализация конкретных продуктов для каждого семейства*/
public class LightFae implements FaeBeing {
    @Override
    public void performMagic() {
        System.out.println("Я — светлая фея!");
    }
}