package Ejercicios.Ejercicio4;
import java.util.ArrayList;
import java.util.HashMap;
public class Inventory {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product 1", 100.0));
        products.add(new Product(2, "Product 2", 200.0));
        products.add(new Product(3, "Product 3", 300.0));
        for(Product product : products){
            product.showInfo();
        }
        HashMap<String, Product> catalog = new HashMap<>();
        catalog.put("1", products.get(0));
        catalog.put("2", products.get(1));
        catalog.put("3", products.get(2));
        for(String key : catalog.keySet()){
            catalog.get(key).showInfo();
        }
        
    }
}
