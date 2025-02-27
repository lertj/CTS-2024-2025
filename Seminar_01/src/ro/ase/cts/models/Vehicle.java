package ro.ase.cts.models;

public abstract class Vehicle {
    public static final int MAX_SPEED = 130;
    public int speed;

    public Vehicle(int speed) {
        if(speed>0){
            this.speed = speed;
        }
    }

    public abstract void drive(int km);
}
