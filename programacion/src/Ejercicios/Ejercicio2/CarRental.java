package Ejercicios.Ejercicio2;

import java.util.ArrayList;

public class CarRental {
    public ArrayList<Car> cars;
    public CarRental(ArrayList<Car> cars){
        this.cars = cars;
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public void rentCar(Car car){
        car.available = false;
    }
    public void returnCar(Car car){
        car.available = true;
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
    
}
