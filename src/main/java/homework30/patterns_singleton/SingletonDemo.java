package homework30.patterns_singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        // Тест Enum Singleton
        System.out.println("=== Enum Singleton Test ===");
        LoggerSingleton.INSTANCE.log("Hello from Enum Singleton!");
        LoggerSingleton.INSTANCE.log("Same instance: " + (LoggerSingleton.INSTANCE == LoggerSingleton.INSTANCE));

        // Тест Eager Initialization
        System.out.println("\n=== Eager Initialization Test ===");
        EagerLogger eager1 = EagerLogger.getInstance();
        EagerLogger eager2 = EagerLogger.getInstance();
        eager1.log("Hello from Eager Logger!");
        System.out.println("Same instance: " + (eager1 == eager2));

        // Тест Lazy Thread-Safe
        System.out.println("\n=== Lazy Thread-Safe Test ===");
        LazyThreadSafeLogger lazy1 = LazyThreadSafeLogger.getInstance();
        LazyThreadSafeLogger lazy2 = LazyThreadSafeLogger.getInstance();
        lazy1.log("Hello from Lazy Logger!");
        System.out.println("Same instance: " + (lazy1 == lazy2));
    }
}