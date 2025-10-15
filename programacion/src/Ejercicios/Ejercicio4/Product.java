package Ejercicios.Ejercicio4;

public class Product {
    public String code;
    public String name;
    public double price;
    public Product(String code, String name, double price){
        this.code = code;
        this.name = name;
        this.price = price;
    }
    public void showInfo(){
        System.out.println("Code: " + code + " | Name: " + name + " | Price: " + price);
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}
