package unidadTres.ejercicioHerencia;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void acelerar() {
        System.out.println("El vehiculo esta acelerando.");
    }

    public void frenar() {
        System.out.println("El vehiculo esta frenando.");
    }
}