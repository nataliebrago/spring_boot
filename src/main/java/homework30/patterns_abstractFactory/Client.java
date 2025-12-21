package homework30.patterns_abstractFactory;

/**
 * Шаг 5: Клиентский код
 */
public class Client {
    public static void main(String[] args) {

        FaeFactory factory = new LightFaeFactory();

        FaeBeing being = factory.createFaeBeing();
        MagicalArtifact artifact = factory.createMagicalArtifact();

        being.performMagic();
        artifact.activate();

        factory = new DarkFaeFactory();

        being = factory.createFaeBeing();
        artifact = factory.createMagicalArtifact();

        being.performMagic();
        artifact.activate();
    }
}