package homework30.patterns_singleton;

public class LazyThreadSafeLogger {
    // Lazy: экземпляр создаётся по требованию
    private static LazyThreadSafeLogger instance;

    // Приватный конструктор
    private LazyThreadSafeLogger() {
        System.out.println("LazyThreadSafeLogger instance created.");
    }

    // Thread-safe getInstance с synchronized
    public static synchronized LazyThreadSafeLogger getInstance() {
        if (instance == null) {
            instance = new LazyThreadSafeLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LazyThreadSafeLogger: " + message);
    }
}