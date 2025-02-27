import ro.ase.cts.models.Car;
import ro.ase.cts.interfaces.Moveable;
import ro.ase.cts.models.SUV;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Toyota", 110, false);
        car.drive(10);
        SUV suv = new SUV("BMW", 110, false, 1700);
        suv.drive(10);
        System.out.println("\n\n\n");
        Moveable[] moveables = {car, suv};
        for(int i=0; i<moveables.length; i++){
            moveables[i].move();
        }
    }
}
