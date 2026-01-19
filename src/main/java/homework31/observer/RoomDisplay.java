package homework31.observer;

public class RoomDisplay implements TemperatureObserver {
    private String roomName;

    public RoomDisplay(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public void updateTemperature(double temperature) {
        System.out.println("В комнате " + roomName + " температура обновлена: " + temperature + "°C");
    }
}