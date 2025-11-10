package unidadTres.laMiga.domain;

public class Cliente{
    String nombre;
    int Telefono;
    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        Telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        Telefono = telefono;
    }
    
}
