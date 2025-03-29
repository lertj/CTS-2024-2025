import ase.cts.models.House;
import ase.cts.models.HouseBuilder;
import ase.cts.models.HouseV2;

public class Main {
    public static void main(String[] args) {
        House house = new House("Str Iubirii Piata Unirii", true, true, false);
        //house.setTV("Sony"); // Odata ce avem Builder nu mai permitem accesul la setters
        //house.setHasRadio(true);

        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.addTV("Samsung");
        houseBuilder.addRadio();
        houseBuilder.addTV("Samsung");
        houseBuilder.addSink();
        House newHouse = houseBuilder.build();

        House cleanerHouse = new HouseBuilder().addRadio().addTV("Samsung").addRadio().build();

        House anotherHouse = (House) new HouseV2.HouseBuilderV3().addTV("Panasonic").build();
        System.out.println(anotherHouse);

        return;
    }
}