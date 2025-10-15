package Ejercicios.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestión de Inventario ===");

        // 1. Crear una instancia de Inventory
        Inventory inventory = new Inventory();

        // 2. Agregar productos usando el método de Inventory
        // Nota: El código del producto es un String, como se define en la clase Product.
        System.out.println("\n--- Agregando productos al inventario ---");
        inventory.addProduct(new Product("P001", "Laptop Gamer", 1200.50));
        inventory.addProduct(new Product("P002", "Mouse Inalámbrico", 25.00));
        inventory.addProduct(new Product("P003", "Teclado Mecánico", 75.99));
        inventory.addProduct(new Product("P004", "Monitor 4K", 300.00));
        inventory.addProduct(new Product("P005", "Auriculares Bluetooth", 60.00));
        inventory.addProduct(new Product("P006", "Disco Duro Externo", 80.00));
        inventory.addProduct(new Product("P007", "Webcam HD", 45.00));
        inventory.addProduct(new Product("P008", "Impresora Láser", 150.00));
        inventory.addProduct(new Product("P009", "Router WiFi", 90.00));
        inventory.addProduct(new Product("P010", "Tablet Android", 200.00));
        inventory.addProduct(new Product("P011", "Smartphone", 700.00));
        inventory.addProduct(new Product("P012", "Smartwatch", 180.00));
        inventory.addProduct(new Product("P013", "Proyector", 250.00));
        inventory.addProduct(new Product("P014", "Altavoces Bluetooth", 55.00));
        inventory.addProduct(new Product("P015", "Cámara Digital", 400.00));
        inventory.addProduct(new Product("P016", "Memoria USB", 15.00));
        inventory.addProduct(new Product("P017", "Cargador Portátil", 35.00));
        inventory.addProduct(new Product("P018", "Tarjeta de Memoria", 20.00)); 
        inventory.addProduct(new Product("P019", "Base de Enfriamiento", 40.00));
        inventory.addProduct(new Product("P020", "Soporte para Laptop", 30.00));


        // 3. Mostrar todos los productos usando el método de Inventory
        System.out.println("\n--- Lista de productos en el inventario ---");
        inventory.showProducts();

        // 4. Obtener y mostrar un producto específico por su código
        System.out.println("\n--- Buscando producto con código 'P002' ---");
        Product foundProduct = inventory.getProduct("P020");
        if (foundProduct != null) {
            System.out.print("Producto encontrado: ");
            foundProduct.showInfo();
        }

        // 5. Actualizar un producto
        System.out.println("\n--- Actualizando el precio del producto 'P001' ---");
        Product updatedProduct = new Product("P001", "Laptop Gamer Pro", 1350.00);
        inventory.updateProduct(updatedProduct);
        inventory.showProducts();

        // 6. Eliminar un producto
        System.out.println("\n--- Eliminando el producto con código 'P003' ---");
        inventory.removeProduct("P003");
        System.out.println("\n--- Lista de productos después de la eliminación ---");
        inventory.showProducts();
    }
}
