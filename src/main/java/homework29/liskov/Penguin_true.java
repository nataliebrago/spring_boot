package homework29.liskov;

class Penguin_true extends Bird_true {
    @Override
    public void eat() { System.out.println("Eating fish"); }

    public void swim() { System.out.println("Swimming"); }
}