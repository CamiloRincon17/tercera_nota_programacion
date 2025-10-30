package unidadTres.herenciaEmpleado.utils;

public class Vendedor extends Empleado {
    double ventas;
    double comision;

    public Vendedor(String nombre, double salarioBase, double ventas, double comision, Direccion direccion) {
        super(nombre, salarioBase, direccion);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularPago() {
        return salarioBase + (ventas * comision);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Vendedor [nombre=" + nombre + ", ventas=" + ventas + ", comision=" + comision + "]");
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

}