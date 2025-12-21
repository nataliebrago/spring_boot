package homework29.liskov;

class Sparrow_true extends Bird_true implements Flyable_true {
    @Override
    public void fly() { System.out.println("Flying"); }
    @Override
    public void eat() { System.out.println("Eating seeds"); }
}