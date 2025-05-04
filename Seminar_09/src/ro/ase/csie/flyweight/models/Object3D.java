package ro.ase.csie.flyweight.models;

import ro.ase.csie.flyweight.interfaces.IFlyweight3D;

import java.util.ArrayList;
import java.util.List;

public class Object3D implements IFlyweight3D {
    String model;
    String color;
    List<Integer> pixels = new ArrayList<>(5000);

    public Object3D(String model, String color, List<Integer> pixels) {
        this.model = model;
        this.color = color;
        this.pixels = pixels;
    }

    @Override
    public void displayObject(Object3Ddetails details) {
        System.out.println("Displaying object " + this.model + " color: " + this.color);
        System.out.printf("The object is at coordinates x=%d, y=%d, z=%d",details.x, details.y, details.z);
    }
}
