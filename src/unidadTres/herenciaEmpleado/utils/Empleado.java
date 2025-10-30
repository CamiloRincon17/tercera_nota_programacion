package unidadTres.herenciaEmpleado.utils;

public class Empleado {

    protected String nombre;
    protected double salarioBase;
    protected Direccion direccion;

    public Empleado(String nombre, double salarioBase, Direccion direccion) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.direccion = direccion;
    
    }

    public double calcularPago() {
        return salarioBase;
    }

    public void mostrarInformacion() {
         System.out.println("Empleado [nombre=" + nombre + ", salarioBase=" + salarioBase + ", direccion="+ direccion +"}");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}