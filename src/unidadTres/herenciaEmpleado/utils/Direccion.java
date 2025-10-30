package unidadTres.herenciaEmpleado.utils;

public class Direccion {
    String ciudad;
    String calle;

    public Direccion(String ciudad, String calle) {
        this.ciudad = ciudad;
        this.calle = calle;
    }

    public void getFullAddress() {
        System.out.println(ciudad + ", " + calle);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

}
