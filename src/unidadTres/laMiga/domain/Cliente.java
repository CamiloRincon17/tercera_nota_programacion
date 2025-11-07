package unidadTres.laMiga.domain;

public class Cliente {
    String nombre;
    int telefono;

    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void mostrarCliente(){
        if(nombre != null || nombre.isBlank()){
            System.out.println("Nombre del cliente: " + nombre);
            System.out.println("Telefono del cliente: " + telefono);
        } else {
            System.out.println("No hay cliente asociado a este pedido.");
        }
        if(telefono == null || telefono.isBlank()){
            System.out.println("Telefono del cliente: " + telefono);
        } else {
            System.out.println("No hay telefono asociado a este cliente.");
        }
    }
}
