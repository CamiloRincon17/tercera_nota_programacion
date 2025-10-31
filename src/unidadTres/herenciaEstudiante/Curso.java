package unidadTres.herenciaEstudiante;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private final String codigo;
    private final String nombre;
    private final List<UnidadTematica> unidades = new ArrayList<>();
    private final List<Estudiante> inscritos = new ArrayList<>();

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<UnidadTematica> getUnidades() {
        return unidades;
    }

    public List<Estudiante> getInscritos() {
        return inscritos;
    }

    public void agregarUnidad(UnidadTematica unidad) {
        this.unidades.add(unidad);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        this.inscritos.add(estudiante);
    }
}
