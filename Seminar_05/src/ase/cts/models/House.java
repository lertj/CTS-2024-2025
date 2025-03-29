package ase.cts.models;

public class House extends AHouse {
    boolean hasFloor;
    boolean hasWalls;
    boolean hasRoof;
    String tvBrand;
    boolean hasRadio;
    boolean hasSink;

    public House(String location, boolean hasFloor, boolean hasWalls, boolean hasRoof, String tvBrand, boolean hasRadio, boolean hasSink) {
        this.location = location;
        this.hasFloor = hasFloor;
        this.hasWalls = hasWalls;
        this.hasRoof = hasRoof;
        this.hasRadio = hasRadio;
        this.hasSink = hasSink;
    }

    public House(String location, boolean hasFloor, boolean hasWalls, boolean hasRoof) {
        this.location = location;
        this.hasFloor = hasFloor;
        this.hasWalls = hasWalls;
        this.hasRoof = hasRoof;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setHasFloor(boolean hasFloor) {
        this.hasFloor = hasFloor;
    }

    void setHasWalls(boolean hasWalls) {
        this.hasWalls = hasWalls;
    }

    void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    void setTV(String brandTV) {
        this.tvBrand = brandTV;
    }

    void setHasRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }

    void setHasSink(boolean hasSink) {
        this.hasSink = hasSink;
    }

    public void addSinkAndTV(){
        this.hasSink = true;
        this.tvBrand = "";
    }

    @Override
    public String toString() {
        return "House{" +
                "hasFloor=" + hasFloor +
                ", hasWalls=" + hasWalls +
                ", hasRoof=" + hasRoof +
                ", tvBrand='" + tvBrand + '\'' +
                ", hasRadio=" + hasRadio +
                ", hasSink=" + hasSink +
                '}';
    }
}
