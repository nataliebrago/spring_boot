package homework30.patterns_builder;

import java.util.ArrayList;
import java.util.List;

class Burger {
    private String bun;
    private String patty;
    private String cheese;
    private List<String> veggies;
    private List<String> sauces;

    private Burger(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.veggies = builder.veggies;
        this.sauces = builder.sauces;
    }

    @Override
    public String toString() {
        return "Burger: " + bun + " buns, " + patty + " patty, " + cheese + " cheese, veggies: " + veggies + ", sauces: " + sauces;
    }


    static class Builder {
        private String bun = "regular";
        private String patty;
        private String cheese;
        private List<String> veggies = new ArrayList<>();
        private List<String> sauces = new ArrayList<>();

        public Builder patty(String patty) {
            this.patty = patty;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder addVeggie(String veggie) {
            this.veggies.add(veggie);
            return this;
        }

        public Builder addSauce(String sauce) {
            this.sauces.add(sauce);
            return this;
        }

        public Burger build() {
            if (patty == null) {
                throw new IllegalStateException("Patty is required");
            }
            return new Burger(this);
        }
    }
}