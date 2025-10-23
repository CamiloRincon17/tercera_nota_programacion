package actividades.ejercicio3Tree;

public class Car {
    public String model;
    public double pricePerDay;
    public boolean available;
    public Car(String model, double pricePerDay){
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }
    public void showInfo(){
        System.out.println("Brand: " 
        + model + " | Price Per Day: " + pricePerDay + " | Available: " + available);
    }
}
