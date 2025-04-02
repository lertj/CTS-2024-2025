package ro.ase.cts.models.builder;

public class CoffeeOrderBuilder extends AbstractCoffeeOrderBuilder {
    CoffeeOrder order;

    public CoffeeOrderBuilder(String type, float price, String size) {
        this.order = new CoffeeOrder(type, price, size);
    }

    @Override
    public AbstractCoffeeOrderBuilder addMilk(String milk) {
        this.order.milk = milk;
        return this;
    }

    @Override
    public AbstractCoffeeOrderBuilder addSugar(int level) {
        this.order.sugarLevel = level;
        return this;
    }

    @Override
    public AbstractCoffeeOrderBuilder addIce() {
        this.order.hasIce = true;
        return this;
    }

    @Override
    public AbstractCoffeeOrderBuilder addFlavour(String flavour) {
        this.order.flavour = flavour;
        return this;
    }

    public CoffeeOrder build(){
        return this.order;
    }
}
