package homework30.patterns_singleton;

// Enum Singleton
public enum LoggerSingleton {
    INSTANCE;  // Единственный экземпляр

    public void log(String message) {
        System.out.println("Logger: " + message);
    }
}