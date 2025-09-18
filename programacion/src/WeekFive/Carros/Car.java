package WeekFive.Carros;

public class Car {
    public String brand;
    public int year;
    public Car(String brand, int year){
        this.brand=brand;
        this.year=year;

    }
    public void showInfo(){
        System.out.println("La marca es: "+brand+"\n El año del auto es: "+year);
    }
}
