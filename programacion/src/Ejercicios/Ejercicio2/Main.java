package Ejercicios.Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 100.0);
        Car car2 = new Car("Ford", 150.0);
        Car car3 = new Car("Chevrolet", 200.0);
        CarRental carRental = new CarRental(new ArrayList<>());
        carRental.addCar(car1);
        carRental.addCar(car2);
        carRental.addCar(car3);
        
        carRental.showAvailableCars();
        carRental.rentCar(car1);
        carRental.showAvailableCars();
        carRental.returnCar(car1);
        carRental.showAvailableCars();
    }
}
