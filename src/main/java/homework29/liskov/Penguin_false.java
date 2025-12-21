package homework29.liskov;

class Penguin_false extends Bird_false {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}