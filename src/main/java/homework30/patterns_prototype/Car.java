package homework30.patterns_prototype;

public class Car implements CarPrototype {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Конструктор для копирования (клон)
    public Car(Car car) {
        this.model = car.model;
        this.year = car.year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public CarPrototype clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', year=" + year + "}";
    }
}