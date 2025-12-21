package homework30.patterns_abstractFactory;

/**Шаг 4: Конкретные фабрики*/
public class LightFaeFactory implements FaeFactory {
    @Override
    public FaeBeing createFaeBeing() {
        return new LightFae();
    }

    @Override
    public MagicalArtifact createMagicalArtifact() {
        return new LightArtifact();
    }
}
