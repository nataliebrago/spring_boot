package homework30.patterns_prototype;

public class Client {
    public static void main(String[] args) {
        // Создаём оригинальную машину
        Car originalCar = new Car("Tesla Model S", 2023);
        System.out.println("Оригинал: " + originalCar);

        // Клонируем её
        Car clonedCar = (Car) originalCar.clone();
        System.out.println("Клон: " + clonedCar);

        // Изменяем клон — оригинал не меняется
        clonedCar.setModel("Tesla Model Y");
        clonedCar.setYear(2024);

        System.out.println("Оригинал после изменения клона: " + originalCar);
        System.out.println("Изменённый клон: " + clonedCar);
    }
}