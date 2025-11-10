package unidadTres.laMiga.domain;

import java.util.Objects;

public class ItemPedido {
    private final Producto producto;
    private final int cantidad;

    public ItemPedido(Producto producto, int cantidad) {
        this.producto = Objects.requireNonNull(producto, "El producto no puede ser nulo");
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularPrecioTotal() {
        return getPrecioUnitarioAplicado() * cantidad;
    }

    public double getPrecioUnitarioAplicado() {
        return calcularPrecioUnitarioConDescuento();
    }

    /**
     * Calcula el precio unitario, aplicando un descuento si la cantidad es 6 o más.
     * @return El precio unitario con el descuento aplicado, si corresponde.
     */
    private double calcularPrecioUnitarioConDescuento() {
        if (cantidad >= 6) {
            switch (producto) {
                case BAGUETTE: return 5500.0;
                case CROISSANT: return 4000.0;
                case PAN_CHOCOLATE: return 5000.0;
            }
        }
        // Si no hay descuento, devuelve el precio original del producto.
        return producto.getPrecio();
    }
}
