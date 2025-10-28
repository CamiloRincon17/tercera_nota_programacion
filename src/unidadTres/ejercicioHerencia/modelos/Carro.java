package unidadTres.ejercicioHerencia.modelos;

public class Carro extends Vehiculo {
    private int numeroDePuertas;
    private boolean aireAcondicionado;
    private boolean esElectrico;

    public Carro(String marca, String modelo, int año, String color, String tipoCombustible, int numeroDePuertas, boolean aireAcondicionado, boolean esElectrico) {
        super(marca, modelo, año, color, tipoCombustible);
        this.numeroDePuertas = numeroDePuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.esElectrico = esElectrico; 

    }

    public void abrirPuertas() {
        System.out.println("Las puertas del carro se estan abriendo.");
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }
    
}