package homework30.patterns_abstractFactory;

/**Шаг 2: Реализация конкретных продуктов для каждого семейства*/
public class LightArtifact implements MagicalArtifact {
    @Override
    public void activate() {
        System.out.println("Дарю сладкий сон или благословение.");
    }
}