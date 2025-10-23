package unidad2.weekFive.ejercicio;

public class Main {
    public static void main(String[] args) {
        Product product1=new Product();
        product1.showProduct();
        Product product2=new Product("laptop",1500.0);
        product2.showProduct();
        Product product3=new Product("phone",800.0,5);
        product3.showProduct();
        product3.update("smartphone");
        product3.update(900.0);
        product3.showProduct();
    }
}
