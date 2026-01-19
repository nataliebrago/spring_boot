package homework31.facade;

class CoffeeMachineFacade {
    private WaterHeater waterHeater;
    private CoffeeGrinder grinder;
    private CoffeeBrewer brewer;

    public CoffeeMachineFacade() {
        this.waterHeater = new WaterHeater();
        this.grinder = new CoffeeGrinder();
        this.brewer = new CoffeeBrewer();
    }

    public void makeCoffee() {
        grinder.grind();
        waterHeater.on();
        waterHeater.boil();
        brewer.brew();
        waterHeater.off();
    }
}