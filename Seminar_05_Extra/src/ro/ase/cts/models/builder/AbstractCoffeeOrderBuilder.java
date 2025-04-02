package ro.ase.cts.models.builder;

public abstract class AbstractCoffeeOrderBuilder {

    public abstract AbstractCoffeeOrderBuilder addMilk(String milk);
    public abstract AbstractCoffeeOrderBuilder addSugar(int level);
    public abstract AbstractCoffeeOrderBuilder addIce();
    public abstract AbstractCoffeeOrderBuilder addFlavour(String flavour);
    public abstract CoffeeOrder build();


}
