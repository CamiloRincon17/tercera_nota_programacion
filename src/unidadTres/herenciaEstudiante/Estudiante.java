package unidadTres.herenciaEstudiante;

public class Estudiante extends Persona {
    private String carrera;
    private Proyecto proyectoAsignado;

    public Estudiante(String id, String nombre, String carrera) {
        super(id, nombre); // Llama al constructor de la clase padre (Persona)
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public Proyecto getProyectoAsignado() {
        return proyectoAsignado;
    }

    public void asignarProyecto(Proyecto proyecto) {
        this.proyectoAsignado = proyecto;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' + ", " +
                super.toString() + // Incluye la información de la clase Persona
                '}';
    }
}
