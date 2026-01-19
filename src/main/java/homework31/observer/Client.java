package homework31.observer;

public class Client{
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        // Создаем дисплеи для комнат
        RoomDisplay livingRoom = new RoomDisplay("Гостинная");
        RoomDisplay kitchen = new RoomDisplay("Кухня");
        RoomDisplay bedroom = new RoomDisplay("Спальня");

        // Регистрируем дисплеи
        sensor.registerObserver(livingRoom);
        sensor.registerObserver(kitchen);
        sensor.registerObserver(bedroom);

        // Меняем температуру
        sensor.setTemperature(22.5);
        sensor.setTemperature(23.0);
        sensor.setTemperature(21.8);
    }
}