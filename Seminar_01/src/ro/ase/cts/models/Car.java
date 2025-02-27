package ro.ase.cts.models;

import ro.ase.cts.interfaces.Moveable;

public class Car extends Vehicle implements Moveable {

    private String model;
    private boolean isMoving;
    private boolean isEngineStarted;

    public Car(String model, int speed, boolean isMoving) {
        super(speed);
        this.model = model;
        this.isMoving = isMoving;
    }

    public void startEngine() {
        if (!isMoving) {
            isEngineStarted = true;
        }
    }

    @Override
    public void drive(int km){
        if(speed > MAX_SPEED){
            System.out.println("Esti prea rapid");
        }
        else{
            System.out.println("Merg cu masina " + km + " kilometri.");
        }
    }

    @Override
    public void move() {
        System.out.println("Si masina se misca...");
    }
}







