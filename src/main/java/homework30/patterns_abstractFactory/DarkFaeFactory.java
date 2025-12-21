package homework30.patterns_abstractFactory;

public class DarkFaeFactory implements FaeFactory {
    @Override
    public FaeBeing createFaeBeing() {
        return new DarkFae();
    }

    @Override
    public MagicalArtifact createMagicalArtifact() {
        return new DarkArtifact();
    }
}

