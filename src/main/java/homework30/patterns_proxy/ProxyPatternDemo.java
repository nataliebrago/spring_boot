package homework30.patterns_proxy;

// Демонстрационный класс
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("кот.jpg");
        Image image2 = new ProxyImage("собака.png");

        System.out.println("Первый просмотр:");
        image1.display();  // Загрузка и отображение

        System.out.println("\nПовторный просмотр:");
        image1.display();  // Уже загружено, без повторной загрузки

        System.out.println("\nВторой прокси:");
        image2.display();  // Собственная загрузка
    }
}