package homework30.patterns_singleton;

public class EagerLogger {
    // Eager: экземпляр создаётся при загрузке класса
    private static final EagerLogger INSTANCE = new EagerLogger();

    // Приватный конструктор
    private EagerLogger() {
        System.out.println("EagerLogger instance created.");
    }

    // Глобальный доступ
    public static EagerLogger getInstance() {
        return INSTANCE;
    }

    public void log(String message) {
        System.out.println("EagerLogger: " + message);
    }
}