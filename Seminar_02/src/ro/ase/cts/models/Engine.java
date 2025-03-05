package ro.ase.cts.models;

public class Engine { // S - Single responsibility (Am separat logica motorului de cea a masinii )

    private boolean isEngineStarted;
    private int capacity;

    public Engine(boolean isEngineStarted, int capacity) {
        this.isEngineStarted = isEngineStarted;
        this.capacity = capacity;
    }

    public boolean isEngineStarted() {
        return isEngineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        isEngineStarted = engineStarted;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void startEngine() {
        if (!isEngineStarted) {
            isEngineStarted = true;
        }
    }
}
