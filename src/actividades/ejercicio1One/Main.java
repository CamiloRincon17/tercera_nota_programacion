package actividades.ejercicio1One;

public class Main {
    public static void main(String[] args) {
        Producto product1 = new Producto("Buso",50,30);
        Producto product2 = new Producto("Pantalon", 70, 20);
        product1.showProduct();
        product1.sell(1);
        product1.restock(30);
        
        product2.showProduct();
        product2.sell(3);
        product2.restock(21);
    }
  
}
