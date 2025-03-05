package ro.ase.cts.models;

import ro.ase.cts.interfaces.Moveable;

public abstract class Vehicle implements Moveable {
    public static final int MAX_SPEED = 130;
    public int speed;

    public Vehicle(int speed) {
        if(speed>0){
            this.speed = speed;
        }
    }

    public abstract void drive(int km);
}
