package unidadTres.herenciaEmpleado;

import unidadTres.herenciaEmpleado.utils.Direccion;
import unidadTres.herenciaEmpleado.utils.Empleado;
import unidadTres.herenciaEmpleado.utils.Gerente;
import unidadTres.herenciaEmpleado.utils.Vendedor;

public class App {
    public static void main(String[] args) {
        Direccion direccionEmpleado = new Direccion("Ciudad1", "Calle1");
        Direccion direccionGerente = new Direccion("Ciudad2", "Calle2");
        Direccion direccionvendedor = new Direccion("Ciudad3", "Calle3");


        Empleado empleado1 = new Empleado("Empleado1", 1000, direccionEmpleado);
        Vendedor vendedor1 = new Vendedor("Vendedor1", 2000, 10000, 0.1, direccionvendedor);
        Gerente gerente1 = new Gerente("Gerente1", 3000, 1000, direccionGerente);

        empleado1.mostrarInformacion();
        empleado1.getDireccion().getFullAddress();
        vendedor1.mostrarInformacion();
        vendedor1.getDireccion().getFullAddress();
        gerente1.mostrarInformacion();  
        gerente1.getDireccion().getFullAddress();


    }

}
