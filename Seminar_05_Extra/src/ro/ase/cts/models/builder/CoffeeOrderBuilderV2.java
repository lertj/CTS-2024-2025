package ro.ase.cts.models.builder;

public class CoffeeOrderBuilderV2 extends AbstractCoffeeOrderBuilder {
    CoffeeOrder order;

    public CoffeeOrderBuilderV2(String type, float price, String size) {
        this.order = new CoffeeOrder(type, price, size);
    }

    @Override
    public CoffeeOrderBuilderV2 addMilk(String milk) {
        this.order.milk = milk;
        return this;
    }

    @Override
    public CoffeeOrderBuilderV2 addSugar(int level) {
        this.order.sugarLevel = level;
        return this;
    }

    @Override
    public CoffeeOrderBuilderV2 addIce() {
        this.order.hasIce = true;
        return this;
    }

    @Override
    public CoffeeOrderBuilderV2 addFlavour(String flavour) {
        this.order.flavour = flavour;
        return this;
    }

    public CoffeeOrderBuilderV2 addCream() {
        this.order.hasCream = true;
        return this;
    }

    public CoffeeOrder build(){
        return this.order;
    }
}
