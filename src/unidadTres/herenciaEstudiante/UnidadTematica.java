package unidadTres.herenciaEstudiante;

public class UnidadTematica {
    private String titulo;
    private int semanas;
    public UnidadTematica(String titulo, int semanas) {
        this.titulo = titulo;
        this.semanas = semanas;
    }
    @Override
    public String toString() {
        return "UnidadTematica [titulo=" + titulo + ", semanas=" + semanas + "]";
    }

    
}
