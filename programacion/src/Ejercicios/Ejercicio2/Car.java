package Ejercicios.Ejercicio2;

public class Car {
    public String brand;
    public double pricePerDay;
    public boolean available;
    public Car(String brand, double pricePerDay){
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }
    public void showInfo(){
        System.out.println("Brand: " + brand + " | Price Per Day: " + pricePerDay + " | Available: " + available);
    }
}
