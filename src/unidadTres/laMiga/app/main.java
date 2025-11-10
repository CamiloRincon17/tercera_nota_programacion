package unidadTres.laMiga.app;

import unidadTres.laMiga.domain.Cliente;
import unidadTres.laMiga.domain.ItemPedido;
import unidadTres.laMiga.domain.Pedido;
import unidadTres.laMiga.domain.Producto;

public class Main {
    public static void main(String[] args) {
        System.out.println("🥖🍞🥐 Bienvenido a La Miga - Sistema de Pedidos 🥐🍞🥖");
        System.out.println("======================================================");

        // 1. Crear un cliente
        System.out.println("\n--- Creando cliente ---");
        Cliente cliente = new Cliente("Uriel Mauricio", 310123456);
        System.out.println("Cliente creado: " + cliente.getNombre());

        // 2. Crear un nuevo pedido para el cliente
        System.out.println("\n--- Creando un nuevo pedido ---");
        Pedido pedido = new Pedido(cliente);
        System.out.println("Pedido creado para " + pedido.getCliente().getNombre() + ". Estado: " + pedido.getEstado());

        // 3. Agregar items al pedido
        System.out.println("\n--- Agregando productos al pedido ---");

        // Caso 1: Cantidad normal, sin descuento por volumen
        ItemPedido item1 = new ItemPedido(Producto.PAN_CHOCOLATE, 2);
        pedido.addItem(item1);
        System.out.println("Añadido: " + item1.getCantidad() + "x " + item1.getProducto().getNombre());

        // Caso 2: Cantidad >= 6, con descuento por volumen
        ItemPedido item2 = new ItemPedido(Producto.BAGUETTE, 7);
        pedido.addItem(item2);
        System.out.println("Añadido: " + item2.getCantidad() + "x " + item2.getProducto().getNombre() + " (con descuento por cantidad)");

        // Caso 3: Otro producto para superar los 60,000 y obtener el descuento del 5%
        ItemPedido item3 = new ItemPedido(Producto.CROISSANT, 4);
        pedido.addItem(item3);
        System.out.println("Añadido: " + item3.getCantidad() + "x " + item3.getProducto().getNombre());

        // 4. Mostrar resumen del pedido antes de confirmar
        System.out.println("\n--- Resumen del Pedido (Antes de confirmar) ---");
        // El subtotal será: (5500*2) + (5500*7) + (4500*4) = 11000 + 38500 + 18000 = 67500
        // Como 67500 > 60000, se aplicará un descuento del 5%
        System.out.println(pedido.generarResumen());

        // 5. Confirmar el pedido
        System.out.println("\n--- Confirmando el pedido ---");
        pedido.confirmarPedido();
        System.out.println("Estado del pedido actualizado a: " + pedido.getEstado());

        // 6. Mostrar resumen final
        System.out.println("\n--- Resumen Final del Pedido ---");
        System.out.println(pedido.generarResumen());

        // 7. Probar las validaciones (casos de error)
        System.out.println("\n--- Probando Validaciones y Casos de Error ---");

        // a) Intentar agregar un item a un pedido ya confirmado
        try {
            System.out.println("Intentando agregar un item a un pedido confirmado...");
            ItemPedido itemExtra = new ItemPedido(Producto.CROISSANT, 1);
            pedido.addItem(itemExtra);
        } catch (IllegalStateException e) {
            System.out.println("✅ Éxito: Se capturó el error esperado -> " + e.getMessage());
        }

        // b) Intentar crear un ItemPedido con cantidad 0 o negativa
        try {
            System.out.println("\nIntentando crear un item con cantidad 0...");
            new ItemPedido(Producto.BAGUETTE, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Éxito: Se capturó el error esperado -> " + e.getMessage());
        }
    }
}