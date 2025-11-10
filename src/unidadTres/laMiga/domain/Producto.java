package unidadTres.laMiga.domain;

public enum Producto {
    // Cada producto ahora solo tiene su nombre y precio unitario.
    BAGUETTE("Baguette", 6000.0),
    CROISSANT("Croissant", 4500.0),
    PAN_CHOCOLATE("Pan de Chocolate", 5500.0);

    // Los campos de un enum deben ser 'final' para asegurar que no cambien.
    private final String nombre;
    private final double precio;

    // El constructor de un enum es implícitamente privado.
    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Solo se necesitan métodos 'getter' para acceder a los valores.
    public String getNombre() {
        return nombre;
    }


    public double getPrecio() {
        return precio;
    }

}
