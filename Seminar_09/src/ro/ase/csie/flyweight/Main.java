package ro.ase.csie.flyweight;

import ro.ase.csie.flyweight.models.Object3D;
import ro.ase.csie.flyweight.models.Object3Ddetails;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Object3Ddetails objDet = new Object3Ddetails(10, 110, 721);
        Object3D obj = new Object3D("Piatra", "grey", new ArrayList<>(10000));
        obj.displayObject(objDet);
    }
}
