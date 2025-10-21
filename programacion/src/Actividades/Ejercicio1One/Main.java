package Actividades.Ejercicio1One;

public class Main {
    public static void main(String[] args) {
        producto product1 = new producto("Buso",50,30);
        producto product2 = new producto("Pantalon", 70, 20);
        product1.showProduct();
        product1.sell(1);
        product1.restock(30);
        
        product2.showProduct();
        product2.sell(3);
        product2.restock(21);
    }
  
}
