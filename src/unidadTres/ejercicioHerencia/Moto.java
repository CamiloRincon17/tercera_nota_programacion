package unidadTres.ejercicioHerencia;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    public void hacerCaballito() {
        System.out.println("La moto esta haciendo un caballito.");
    }
}
