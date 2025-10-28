package unidadTres.ejercicioHerencia.modelos;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected String color;
    protected String tipoCombustible;


    public Vehiculo(String marca, String modelo, int año, String color, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
    }

    public void acelerar() {
        System.out.println("El vehiculo esta acelerando.");
    }

    public void frenar() {
        System.out.println("El vehiculo esta frenando.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
}