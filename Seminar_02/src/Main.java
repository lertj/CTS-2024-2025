import ro.ase.cts.exceptions.IllegalEngineCapacity;
import ro.ase.cts.models.Car;
import ro.ase.cts.interfaces.Moveable;
import ro.ase.cts.models.ElectricCar;
import ro.ase.cts.models.SUV;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 110, false);
        ElectricCar eCar= new ElectricCar("Hyundai", 120, false, 77);
        try{
            car.startCar();
            car.drive(10);
            SUV suv = new SUV("BMW", 110, false, 1700);
            suv.drive(10);
            System.out.println("\n\n\n");
            Moveable[] moveables = {car, suv, eCar}; // D - Dependency Inversion ( "Depindem" de conceptul abstract de "entitate ce se paote misca", nu de ceva concret - o masina, un Suv, etc)
            for(int i=0; i<moveables.length; i++){
                moveables[i].move(); // L - Liskov Substitution ( putem inlocui un moveable cu oricare din descendentii/derivatele sale - Car, ElectricCar, etc )
            }
        } catch (IllegalEngineCapacity e) {
            System.out.println("Nu am putut porni masina.");
            System.out.println("Mesajul de eroare este: " + e.getMessage());
        }



    }
}
