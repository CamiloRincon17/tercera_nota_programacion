import java.time.LocalDateTime;
import java.util.*;

// ----------------- ENUM -----------------
enum TipoMovimiento {
    ENTRADA, SALIDA
}

// ----------------- PRODUCTO -----------------
class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int idProducto, String nombre, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getIdProducto() { return idProducto; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void ajustarStock(int cantidad, TipoMovimiento tipo) throws Exception {
        if (cantidad <= 0) throw new Exception("La cantidad debe ser positiva.");
        if (tipo == TipoMovimiento.SALIDA && cantidad > stock)
            throw new Exception("Stock insuficiente. Disponible: " + stock);

        if (tipo == TipoMovimiento.ENTRADA) {
            stock += cantidad;
        } else {
            stock -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "[" + idProducto + "] " + nombre + " | Precio: " + precio + " | Stock: " + stock;
    }
}

// ----------------- USUARIO -----------------
class Usuario {
    private int idUsuario;
    private String nombre;
    private String rol;

    public Usuario(int idUsuario, String nombre, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.rol = rol;
    }

    public int getIdUsuario() { return idUsuario; }
    public String getNombre() { return nombre; }
    public String getRol() { return rol; }
}

// ----------------- MOVIMIENTO -----------------
class Movimiento {
    private int idMovimiento;
    private TipoMovimiento tipo;
    private LocalDateTime fecha;
    private int cantidad;
    private Producto producto;
    private Usuario usuario;

    public Movimiento(int idMovimiento, TipoMovimiento tipo, int cantidad, Producto producto, Usuario usuario) {
        this.idMovimiento = idMovimiento;
        this.tipo = tipo;
        this.fecha = LocalDateTime.now();
        this.cantidad = cantidad;
        this.producto = producto;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Mov#" + idMovimiento + " | " + tipo + " | Pdfrod:" + producto.getNombre() +
               " | Cant:" + cantidad + " | Usuario:" + usuario.getNombre() +
               " | Fecha:" + fecha;
    }
}

// ----------------- INVENTARIO -----------------
class Inventario {
    private Map<Integer, Producto> productos = new HashMap<>();
    private List<Movimiento> movimientos = new ArrayList<>();
    private int seqProducto = 0;
    private int seqMovimiento = 0;

    public Producto crearProducto(String nombre, double precio, int stockInicial) throws Exception {
        if (nombre == null || nombre.isBlank()) throw new Exception("Nombre inválido.");
        if (precio < 0) throw new Exception("El precio no puede ser negativo.");
        if (stockInicial < 0) throw new Exception("El stock inicial no puede ser negativo.");

        seqProducto++;
        Producto p = new Producto(seqProducto, nombre, precio, stockInicial);
        productos.put(p.getIdProducto(), p);
        return p;
    }

    public Producto obtenerProducto(int id) throws Exception {
        if (!productos.containsKey(id))
            throw new Exception("Producto no encontrado. Debes crearlo antes.");
        return productos.get(id);
    }

    public List<Producto> listarProductos() {
        return new ArrayList<>(productos.values());
    }

    public Movimiento registrarMovimiento(int productoId, int cantidad, TipoMovimiento tipo, Usuario usuario) throws Exception {
        Producto p = obtenerProducto(productoId);
        p.ajustarStock(cantidad, tipo);

        seqMovimiento++;
        Movimiento m = new Movimiento(seqMovimiento, tipo, cantidad, p, usuario);
        movimientos.add(m);
        return m;
    }

    public List<Movimiento> listarMovimientos() {
        return movimientos;
    }
}

// ----------------- MAIN -----------------
public class InventarioApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Inventario inv = new Inventario();

        System.out.print("Nombre de usuario: ");
        String nombre = in.nextLine();
        System.out.print("Rol (admin/empleado): ");
        String rol = in.nextLine();
        Usuario usuario = new Usuario(1, nombre, rol);

        while (true) {
            System.out.println("\n===== MENÚ INVENTARIO =====");
            System.out.println("1. Crear producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Registrar ENTRADA");
            System.out.println("4. Registrar SALIDA");
            System.out.println("5. Ver movimientos");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");
            String op = in.nextLine();

            try {
                switch (op) {
                    case "1":
                        System.out.print("Nombre producto: ");
                        String n = in.nextLine();
                        System.out.print("Precio: ");
                        double precio = Double.parseDouble(in.nextLine());
                        System.out.print("Stock inicial: ");
                        int stock = Integer.parseInt(in.nextLine());
                        Producto p = inv.crearProducto(n, precio, stock);
                        System.out.println("✅ Producto creado: " + p);
                        break;
                    case "2":
                        System.out.println("=== Productos ===");
                        for (Producto prod : inv.listarProductos()) {
                            System.out.println(prod);
                        }
                        break;
                    case "3":
                        System.out.print("ID del producto: ");
                        int idE = Integer.parseInt(in.nextLine());
                        System.out.print("Cantidad a ingresar: ");
                        int cantE = Integer.parseInt(in.nextLine());
                        Movimiento movE = inv.registrarMovimiento(idE, cantE, TipoMovimiento.ENTRADA, usuario);
                        System.out.println("✅ Movimiento registrado: " + movE);
                        break;
                    case "4":
                        System.out.print("ID del producto: ");
                        int idS = Integer.parseInt(in.nextLine());
                        System.out.print("Cantidad a retirar: ");
                        int cantS = Integer.parseInt(in.nextLine());
                        Movimiento movS = inv.registrarMovimiento(idS, cantS, TipoMovimiento.SALIDA, usuario);
                        System.out.println("✅ Movimiento registrado: " + movS);
                        break;
                    case "5":
                        System.out.println("=== Movimientos ===");
                        for (Movimiento m : inv.listarMovimientos()) {
                            System.out.println(m);
                        }
                        break;
                    case "0":
                        System.out.println("Hasta pronto!");
                        in.close();
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println(" Error: " + e.getMessage());
            }
        }
    }
}
