package unidadTres.laMiga.domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> items;
    private EstadoPedido estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.items = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void addItem(ItemPedido item) {
        if (this.estado == EstadoPedido.CONFIRMADO) {
            throw new IllegalStateException("No se pueden agregar ítems a un pedido confirmado.");
        }
        this.items.add(item);
    }

    public void confirmarPedido() {
        if (this.estado == EstadoPedido.PENDIENTE) {
            this.estado = EstadoPedido.CONFIRMADO;
        } else {
            throw new IllegalStateException("El pedido ya está confirmado o en un estado inválido para confirmar.");
        }
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (ItemPedido item : items) {
            subtotal += item.calcularPrecioTotal();
        }
        return subtotal;
    }

    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        if (subtotal > 60000.0) {
            return subtotal * 0.05;
        }
        return 0;
    }

    public double calcularTotalFinal() {
        return calcularSubtotal() - calcularDescuento();
    }

    public String generarResumen() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("--- Resumen del Pedido ---\n");
        resumen.append("Cliente: ").append(cliente.getNombre()).append(" (Tel: ").append(cliente.getTelefono()).append(")\n");
        resumen.append("Estado: ").append(estado).append("\n");
        resumen.append("Items:\n");
        for (ItemPedido item : items) {
            resumen.append("  - ").append(item.getProducto().getNombre())
                   .append(" x ").append(item.getCantidad())
                   .append(" (Precio unitario aplicado: $").append(String.format("%.2f", item.getPrecioUnitarioAplicado()))
                   .append(") = $").append(String.format("%.2f", item.calcularPrecioTotal())).append("\n");
        }
        resumen.append("Subtotal: $").append(String.format("%.2f", calcularSubtotal())).append("\n");
        resumen.append("Descuento: $").append(String.format("%.2f", calcularDescuento())).append("\n");
        resumen.append("Total Final: $").append(String.format("%.2f", calcularTotalFinal())).append("\n");
        resumen.append("--------------------------\n");
        return resumen.toString();
    }
}
