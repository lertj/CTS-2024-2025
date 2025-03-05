package ro.ase.cts.models;

import ro.ase.cts.interfaces.Moveable;

public class SUV extends Car implements Moveable {

    public float weight;

    public SUV(String model, int speed, boolean isMoving, int weight) {
        super(model, speed, isMoving);
        this.weight = weight;
    }

    @Override
    public void drive(int km) {
        if(this.speed > MAX_SPEED){
            System.out.println("Esti prea rapid");
        }
        else {
            System.out.println("Merg cu SUV-ul " + km + " kilomoetri.");
        }
    }

    @Override
    public void move() {
        System.out.println("Si SUV-ul se misca...");
    }
}
