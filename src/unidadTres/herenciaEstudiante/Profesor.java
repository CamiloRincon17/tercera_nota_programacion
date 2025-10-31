package unidadTres.herenciaEstudiante;

import java.util.List;
import java.util.ArrayList;

public class Profesor extends Persona {
    private String departamento;
    private List<Curso> cursosAsignados;
    private List<Proyecto> proyectosDirigidos;

    public Profesor(String id, String nombre, String departamento) {
        super(id, nombre);
        this.departamento = departamento;
        this.cursosAsignados = new ArrayList<>();
        this.proyectosDirigidos = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Curso> getCursosAsignados() {
        return cursosAsignados;
    }

    public List<Proyecto> getProyectosDirigidos() {
        return proyectosDirigidos;
    }

    public void asignarCurso(Curso curso) {
        this.cursosAsignados.add(curso);
    }

    public void dirigirProyecto(Proyecto proyecto) {
        this.proyectosDirigidos.add(proyecto);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                ", departamento='" + departamento + '\'' +
                ", " + super.toString() +
                '}';
    }
}
