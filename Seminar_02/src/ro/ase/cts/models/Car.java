package ro.ase.cts.models;

import ro.ase.cts.exceptions.IllegalEngineCapacity;

public class Car extends Vehicle {

    private String model;
    private boolean isMoving;
    Engine engine = null;

    public Car(String model, int speed, boolean isMoving) {
        super(speed);
        this.model = model;
        this.isMoving = isMoving;
        this.engine = new Engine(false, 550);
    }

    public void startCar() throws IllegalEngineCapacity {
        if(this.engine.getCapacity() < 500 ){
            throw new IllegalEngineCapacity("Nu ai motor.", this.engine.getCapacity());
        } else if (!isMoving){
            this.engine.startEngine();
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







