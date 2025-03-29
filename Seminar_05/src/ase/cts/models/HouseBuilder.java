package ase.cts.models;

import ase.cts.interfaces.IBuilder;

public class HouseBuilder implements IBuilder {
    private House house;

    public HouseBuilder() {
        this.house = new House("Piata Unirii", true, true, true);
    }

    public HouseBuilder addTV(String brand)  {//throws Exception
        if(this.house.hasRadio == false){
            System.out.println("Nu discutam fara radio");
            return this;

            //throw new Exception();
        }
        this.house.setTV(brand);
        return this;
    }

    public HouseBuilder addSink(){
        this.house.setHasSink(true);
        return this;
    }

    public HouseBuilder addRadio(){
        this.house.setHasRadio(true);
        return this;
    }

    public House build(){
        if(this.house.hasRadio == false && this.house.tvBrand != null){
            System.out.println("Nu pot crea aceasta casa");
            return null;

            //throw new Exception();
        }
        return house;
    }
}
