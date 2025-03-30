package ase.cts.models;

import ase.cts.interfaces.IBuilder;

public class HouseV2 extends AHouse {
    boolean hasFloor;
    boolean hasWalls;
    boolean hasRoof;
    String tvBrand;
    boolean hasRadio;
    boolean hasSink;

    private HouseV2(String location, boolean hasFloor, boolean hasWalls, boolean hasRoof, String tvBrand, boolean hasRadio, boolean hasSink) {
        this.location = location;
        this.hasFloor = hasFloor;
        this.hasWalls = hasWalls;
        this.hasRoof = hasRoof;
        this.hasRadio = hasRadio;
        this.hasSink = hasSink;
    }

    private HouseV2(String location, boolean hasFloor, boolean hasWalls, boolean hasRoof) {
        this.location = location;
        this.hasFloor = hasFloor;
        this.hasWalls = hasWalls;
        this.hasRoof = hasRoof;
    }

    private void setLocation(String location) {
        this.location = location;
    }

    private void setHasFloor(boolean hasFloor) {
        this.hasFloor = hasFloor;
    }

    private void setHasWalls(boolean hasWalls) {
        this.hasWalls = hasWalls;
    }

    private void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    private void setTV(String brandTV) {
        this.tvBrand = brandTV;
    }

    private void setHasRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }

    private void setHasSink(boolean hasSink) {
        this.hasSink = hasSink;
    }

    private void setSinkAndTV(){
        this.hasSink = true;
        this.tvBrand = "";
    }

    public static class HouseBuilderV3 implements IBuilder{
        private House house;

        public HouseBuilderV3() {
            this.house = new House("Piata Unirii", true, true, true);
        }

        public HouseBuilderV3 addTV(String brand){
            this.house.setTV(brand);
            return this;
        }

        public HouseBuilderV3 addSink(){
            this.house.setHasSink(true);
            return this;
        }

        public HouseBuilderV3 addRadio(){
            this.house.setHasRadio(true);
            return this;
        }

        public AHouse build(){
            return house;
        }
    }
}
