package ro.ase.cts.models;

public class ElectricCar extends Car{ // O - Open/Closed (Electric car este extiensia lui Car. Nu modificam Car)
    int batteryCapacity;
    public ElectricCar(String model, int speed, boolean isMoving, int batteryCapacity) {
        super(model, speed, isMoving);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void move() {
        System.out.println("Masina electrica se misca.");
    }
}
