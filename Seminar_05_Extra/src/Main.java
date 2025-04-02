import ro.ase.cts.models.builder.CoffeeOrder;
import ro.ase.cts.models.builder.CoffeeOrderBuilder;
import ro.ase.cts.models.builder.CoffeeOrderBuilderV2;

public class Main {
    public static void main(String[] args) {
        //builder
        ///CoffeeOrder coffee = new CoffeeOrder("Latte", 15, "Tall"); // error

        CoffeeOrder coffeeBuilder = new CoffeeOrderBuilder("Latte", 15, "Tall")
                .addFlavour("Vanilla")
                .addMilk("Soy")
                .build();

        CoffeeOrder coffeeBuilderV2 = new CoffeeOrderBuilderV2("Latte", 15, "Tall")
                .addFlavour("Vanilla")
                .addMilk("Soy")
                .addCream()
                .build();


        // builder

        //factory

        // ro.ase.cts.models.factory.CoffeeOrder fOrder = new ro.ase.cts.models.factory.CoffeeOrder("Latte", 15, "Tall"); // erroare deoarece am schimbat nr de parametri
        return;
    }
}
