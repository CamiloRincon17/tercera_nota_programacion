package unidadTres.ejercicioHerencia.modelos;

public class Moto extends Vehiculo {
    private int cilindrada;
    private int capacidadTanque;
    private String tipoMoto;


    public Moto(String marca, String modelo, int año, String color, String tipoCombustible, int cilindrada, int capacidadTanque, String tipoMoto) {
        super(marca, modelo, año, color, tipoCombustible);
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;
        this.tipoMoto = tipoMoto;
    }

    public void hacerCaballito() {
        System.out.println("La moto esta haciendo un caballito.");
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
    
}
