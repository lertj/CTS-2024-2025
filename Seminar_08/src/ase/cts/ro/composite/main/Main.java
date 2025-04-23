package ase.cts.ro.composite.main;

import ase.cts.ro.composite.ITGroup;
import ase.cts.ro.composite.ITguy;

public class Main {
    public static void main(String[] args) {

        ITGroup root = new ITGroup("Root");
        ITGroup gr1 = new ITGroup("Group1");
        ITGroup gr2 = new ITGroup("Group2");

        ITguy guy1 = new ITguy("IT1", 110);
        ITguy guy2 = new ITguy("IT2", 120);
        ITguy guy3 = new ITguy("IT3", 130);

        root.addEmployee(gr1);
        root.addEmployee(gr2);

        gr1.addEmployee(guy1);
        gr1.addEmployee(guy2);
        gr2.addEmployee(guy3);

        System.out.println(guy1.printDetails());
        System.out.println();
        System.out.println(gr1.printDetails());

        ITGroup gr3 = new ITGroup("gr3");
        gr3.addEmployee(new ITguy("NewGuy", 10));
        gr2.addEmployee(gr3);

        System.out.println();
        System.out.println(root.printDetails());
    }
}