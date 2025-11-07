package unidadTres.laMiga.domain;

public class itemPedido {
    private final Producto producto;
    private final int cantidad;
    public itemPedido(Producto producto, int cantidad) {
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
    public int precioUnitarioAplicado() {
        return (cantidad>=6) producto.getPrecio() * cantidad;
    }
}

