package ro.ase.cts.models.factory;

public class CoffeeOrder {
    String type;
    float price;
    String size;
    String milk;
//    int sugarLevel;
//    boolean hasIce;
//    String flavour;
//    boolean hasCream;

    public CoffeeOrder(String type, float price, String size, String milk) {
        this.type = type;
        this.price = price;
        this.size = size;
        this.milk = milk;
    }


}
