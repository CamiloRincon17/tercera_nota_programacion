package unidadTres.herenciaEmpleado.utils;

public class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, double salarioBase, double bono, Direccion direccion) {
        super(nombre, salarioBase, direccion);
        this.bono = bono;
    }

    @Override
    public double calcularPago() {
        return salarioBase + bono;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Gerente [nombre=" + nombre + ", bono=" + bono + ", salarioBase=" + salarioBase +" direccion="+ direccion +"]" );
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

}
