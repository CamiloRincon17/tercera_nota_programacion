package WeekFive.ejercicio;
public class Product {
    String name;
    double price;
    int quantity;
    public Product(){
        this.name="undafined";
        this.price=0.0;
        this.quantity=0;
    }
    public Product(String name, double price){
        this.name=name;
        this.price=price;
        this.quantity=0;
    }
    public Product(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    void showProduct(){
        System.out.println("Product: "+name+" | Price: "+price+" | Quantity: "+quantity);
    }
     public void update(String name){
        this.name=name;
    }
    public void update(double price){
        if(price>0){
            this.price=price;
        }else{
            System.out.println("The price must be over 0");
        }
    }
}
