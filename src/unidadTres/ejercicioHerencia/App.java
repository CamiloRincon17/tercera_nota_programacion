package unidadTres.ejercicioHerencia;

import unidadTres.ejercicioHerencia.modelos.Carro;
import unidadTres.ejercicioHerencia.modelos.Moto;

public class App {
    public static void main(String[] args) {
        Carro miCarro = new Carro("Toyota", "Corolla", 2022, "Rojo", "Gasolina", 4, true, false);
        Moto miMoto = new Moto("Honda", "CBR500R", 2023, "Negro", "Gasolina", 500, 17, "Deportiva");
        Moto Motorcycle = new Moto("Yamaha", "MT-07", 2021, "Azul", "Gasolina", 689, 14, "Naked");
        System.out.println("Informacion del Carro:");
        System.out.println("Marca: " + miCarro.getMarca());
        System.out.println("Modelo: " + miCarro.getModelo());
        System.out.println("Año: " + miCarro.getAño());
        miCarro.acelerar();
        miCarro.abrirPuertas();

        System.out.println("\nInformacion de la Moto:");
        System.out.println("Marca: " + miMoto.getMarca());
        System.out.println("Modelo: " + miMoto.getModelo());
        System.out.println("Año: " + miMoto.getAño());
        miMoto.acelerar();
        miMoto.hacerCaballito();
        System.err.println("\nInformacion de la Moto 2:");
        System.out.println("Marca: " + Motorcycle.getMarca());
        System.out.println("Modelo: " + Motorcycle.getModelo());
        System.out.println("Año: " + Motorcycle.getAño());
        Motorcycle.acelerar();
        Motorcycle.hacerCaballito();
    }
}