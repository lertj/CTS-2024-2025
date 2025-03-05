package ro.ase.cts.exceptions;

public class IllegalEngineCapacity extends RuntimeException{
    int capacity;

    public IllegalEngineCapacity(String message, int capacity) {

        super(message + " Capacitatea motorului este de " + capacity);
        this.capacity = capacity;
    }
}
