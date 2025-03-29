package ase.cts.models;

public class HouseBuilderV2 {
    String location;
    boolean hasFloor;
    boolean hasWalls;
    boolean hasRoof;
    String tvBrand;
    boolean hasRadio;
    boolean hasSink;

    public HouseBuilderV2() {
        this.location = "Dorobanti";
        this.hasFloor = true;
        this.hasWalls = true;
        this.hasRoof = true;
    }

    public HouseBuilderV2 addTV(String brand){
        this.tvBrand = brand;
        return this;
    }

    public HouseBuilderV2 addSink(){
        this.hasSink = true;
        return this;
    }

    public HouseBuilderV2 addRadio(){
        this.hasRadio = true;
        return this;
    }

    public House build(){
        return new House(location, hasFloor, hasWalls, hasRoof, tvBrand, hasRadio, hasSink);
    }
}
