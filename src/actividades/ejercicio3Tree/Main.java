package actividades.ejercicio3Tree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 100.0);
        Car car2 = new Car("Ford Fusion", 150.0);
        Car car3 = new Car("Chevrolet Malibu", 200.0);
        Car car4 = new Car("Honda Accord", 110.0);
        Car car5 = new Car("Nissan Altima", 105.0);
        Car car6 = new Car("Volkswagen Jetta", 120.0);
        Car car7 = new Car("BMW 3 Series", 250.0);
        Car car8 = new Car("Mercedes-Benz C-Class", 260.0);
        Car car9 = new Car("Audi A4", 255.0);
        Car car10 = new Car("Hyundai Elantra", 95.0);
        
        CarRental carRental = new CarRental(new ArrayList<>());
        carRental.addCar(car1);
        carRental.addCar(car2);
        carRental.addCar(car3);
        carRental.addCar(car4);
        carRental.addCar(car5);
        carRental.addCar(car6);
        carRental.addCar(car7);
        carRental.addCar(car8);
        carRental.addCar(car9);
        carRental.addCar(car10);
        
        carRental.showAvailableCars();
        carRental.rentCar(car1);
        carRental.showAvailableCars();
        carRental.returnCar(car1);
        carRental.showAvailableCars();

        // Ejemplo de cálculo de total
        System.out.println("\n--- Calculando el costo del alquiler ---");
        double totalCost = carRental.calculateTotal(car2, 5); // Alquilar el Ford por 5 días
        System.out.println("Costo total para " + car2.model + " por 5 días: $" + totalCost);
        carRental.searchcar("Audi A4");
        String searchResult = carRental.searchcar("Audi A4");
        System.out.println(searchResult);
        // Ejemplo si el coche no está disponible
        carRental.rentCar(car3);
        double unavailableCost = carRental.calculateTotal(car3, 3);
        System.out.println("Costo total para " + car3.model + " (no disponible) por 3 días: $" + unavailableCost);
    }
}
