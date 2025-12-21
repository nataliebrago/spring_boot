package homework30.patterns_builder;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder()
                .patty("beef")
                .cheese("cheddar")
                .addVeggie("lettuce")
                .addVeggie("tomato")
                .addSauce("ketchup")
                .build();

        System.out.println(burger);

    }
}