package ase.en.sqt;

public class SmellyCar {
    private String carModel;
    private int yearOfManufacture;
    private String carBrand;
    private boolean isEngineRunning;
    private int speedOfCar;
    private String colorOfCar;
    private boolean isInMotion;

    public SmellyCar(String model, int year, String brand, String color) {
        this.carModel = model;
        this.yearOfManufacture = year;
        this.carBrand = brand;
        this.colorOfCar = color;
        this.isEngineRunning = false;
        this.speedOfCar = 0;
        this.isInMotion = false;
    }

    public void startCarEngineAndDriveIfReady() {
        if (!isEngineRunning) {
            startEngine();
        }
        moveCarRandomlyUntilItHitsItsMaximumSpeed();
    }

    public void startEngine() {
        if (!isEngineRunning) {
            System.out.println("Starting the engine...");
            isEngineRunning = true;
        } else {
            System.out.println("Engine is already running, but we're pretending to start it again!");
        }
    }

    public void moveCarRandomlyUntilItHitsItsMaximumSpeed() {
        while (speedOfCar < 1000) {
            speedOfCar += randomSpeedIncrement();
            if (speedOfCar > 1000) {
                speedOfCar = 1000;
            }
            System.out.println("Car speed is " + speedOfCar + " km/h. Moving wildly.");
            if (speedOfCar >= 1000) {
                stopCarAndReflectOnItsExistence();
            }
        }
    }

    private int randomSpeedIncrement() {
        return (int)(Math.random() * 10) + 5;
    }

    private void stopCarAndReflectOnItsExistence() {
        System.out.println("Car has reached its maximum speed, but who am I kidding? Why am I driving?");
        isInMotion = false;
    }

    public void crashIntoSomethingAndLaugh() {
        if (isInMotion) {
            System.out.println("CRASH! But is it really a crash, or just the universe’s way of teaching me?");
        } else {
            System.out.println("We can't crash if we're not moving, right?");
        }
    }

    public void randomStateOfBeing() {
        int state = (int)(Math.random() * 3);
        switch (state) {
            case 0:
                isInMotion = true;
                System.out.println("Car is now in motion, but am I really moving forward in life?");
                break;
            case 1:
                isInMotion = false;
                System.out.println("Car stopped, existential crisis initiated.");
                break;
            case 2:
                System.out.println("Car is parked, yet the engine still hums.");
                break;
        }
    }

    public void doCarThings() {
        randomStateOfBeing();
        startCarEngineAndDriveIfReady();
        crashIntoSomethingAndLaugh();
    }

    public static void main(String[] args) {
        SmellyCar car = new SmellyCar("FunkyCar", 2025, "WeirdBrand", "Rainbow");
        car.doCarThings();
        car.crashIntoSomethingAndLaugh();
    }
}