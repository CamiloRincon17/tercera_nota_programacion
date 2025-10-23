package actividades.Ejercicio4Four;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    private ArrayList<Product> products;
    private HashMap<String, Product> catalog;

    public Inventory() {
        this.products = new ArrayList<>();
        this.catalog = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        catalog.put(product.getCode(), product);
    }

    public boolean removeProduct(String code) {
        Product product = catalog.get(code);
        if (product != null) {
            return products.remove(product) && catalog.remove(code) != null;
        }
        return false;
    }

    public void updateProduct(Product updatedProduct) {
        // Primero, obtenemos el producto antiguo usando el código del producto actualizado.
        Product oldProduct = catalog.get(updatedProduct.getCode());

        // Si el producto antiguo existe, significa que el código es válido y está en nuestro inventario.
        if (oldProduct != null) {
            // Reemplazamos el producto antiguo en el HashMap.
            catalog.put(updatedProduct.getCode(), updatedProduct);

            // Reemplazamos el producto antiguo en el ArrayList.
            // indexOf es O(n), pero es una operación necesaria para mantener la consistencia.
            int index = products.indexOf(oldProduct);
            products.set(index, updatedProduct);
        }
    }

    public Product getProduct(String code) {
        Product product = catalog.get(code);
        if (product == null) {
            // Lanzamos una excepción si el producto no se encuentra.
            throw new NullPointerException("No se encontró ningún producto con el código: " + code);
        }
        return product;
    }

    public void showProducts() {
        for (Product product : products) {
            product.showInfo();
        }
    }

    public void showCatalog() {
        for (String key : catalog.keySet()) {
            catalog.get(key).showInfo();
        }
    }
}