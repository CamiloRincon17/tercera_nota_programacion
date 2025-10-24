package unidadTres.ejercicioHerencia;

public class Carro extends Vehiculo {
    private int numeroDePuertas;

    public Carro(String marca, String modelo, int anio, int numeroDePuertas) {
        super(marca, modelo, anio);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void abrirPuertas() {
        System.out.println("Las puertas del carro se estan abriendo.");
    }
}