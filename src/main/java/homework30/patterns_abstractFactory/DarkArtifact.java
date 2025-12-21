package homework30.patterns_abstractFactory;

public class DarkArtifact implements MagicalArtifact {
    @Override
    public void activate() {
        System.out.println("Разбиваю сердца!");
    }
}