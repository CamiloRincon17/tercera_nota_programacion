package unidadTres.ejercicioHerencia;

public class App {
    public static void main(String[] args) {
        Carro miCarro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto miMoto = new Moto("Honda", "CBR500R", 2023, false);

        System.out.println("Informacion del Carro:");
        System.out.println("Marca: " + miCarro.marca);
        System.out.println("Modelo: " + miCarro.modelo);
        System.out.println("Anio: " + miCarro.anio);
        miCarro.acelerar();
        miCarro.abrirPuertas();

        System.out.println("\nInformacion de la Moto:");
        System.out.println("Marca: " + miMoto.marca);
        System.out.println("Modelo: " + miMoto.modelo);
        System.out.println("Anio: " + miMoto.anio);
        miMoto.acelerar();
        miMoto.hacerCaballito();
    }
}