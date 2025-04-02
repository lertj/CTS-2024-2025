package ro.ase.cts.models.builder;

public class CoffeeOrder {
    String type;
    float price;
    String size;
    String milk;
    int sugarLevel;
    boolean hasIce;
    String flavour;
    boolean hasCream;

    CoffeeOrder(String type, float price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }


}
