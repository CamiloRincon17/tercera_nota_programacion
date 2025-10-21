package Actividades.Ejercicio3Tree;

import java.util.ArrayList;

public class CarRental {
    public ArrayList<Car> cars;
    public CarRental(ArrayList<Car> cars){
        this.cars = cars;
    }
    public void addCar(Car c){
        cars.add(c);
    }
    public void rentCar(Car car){
        car.available = false;
    }
    public void returnCar(Car car){
        car.available = true;
    }
    public double calculateTotal(Car c, int days){
        if(c.available){
            return c.pricePerDay * days; 
        }
        return 0.0; 
    }
    public void showAvailableCars(){
        for(Car car : cars){
            if(car.available){
                car.showInfo();
            }
            else{
                System.out.println("Car is not available");
            }
        }
    }
    public String searchcar(String model){
        for (Car car : cars) {
            if (car.model.equalsIgnoreCase(model)) {
                System.out.println("-".repeat(60));
                return "Car found: " + car.model + " | Price Per Day: " + car.pricePerDay + " | Available: " + car.available;
            }
        }
        System.out.println("--".repeat(60));
        return "Car with model " + model + " not found.";
    }
    
}
