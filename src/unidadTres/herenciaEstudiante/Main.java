package unidadTres.herenciaEstudiante;

public class Main {
    public static void main(String[] args) {
        // 1. Crear instancias de Estudiantes y Profesores
        System.out.println("--- Creando Personas ---");
        Estudiante estudiante1 = new Estudiante("E001", "Ana Gomez", "Ingeniería de Software");
        Estudiante estudiante2 = new Estudiante("E002", "Luis Parra", "Diseño Gráfico");
        Profesor profesor1 = new Profesor("P01", "Carlos Diaz", "Departamento de Ciencias de la Computación");

        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(profesor1);

        // 2. Crear Cursos y Unidades Temáticas
        System.out.println("\n--- Creando Cursos y Unidades ---");
        Curso cursoProg = new Curso("CS101", "Programación Orientada a Objetos");
        cursoProg.agregarUnidad(new UnidadTematica("Introducción a Java", 2));
        cursoProg.agregarUnidad(new UnidadTematica("Herencia y Polimorfismo", 4));

        Curso cursoBaseDatos = new Curso("CS205", "Bases de Datos");
        cursoBaseDatos.agregarUnidad(new UnidadTematica("Modelo Relacional", 3));

        // 3. Asignar cursos a un profesor
        profesor1.asignarCurso(cursoProg);
        profesor1.asignarCurso(cursoBaseDatos);

        // 4. Inscribir estudiantes en cursos
        cursoProg.inscribirEstudiante(estudiante1);
        cursoProg.inscribirEstudiante(estudiante2);
        cursoBaseDatos.inscribirEstudiante(estudiante1);

        // 5. Crear y asignar un proyecto de grado
        System.out.println("\n--- Creando y Asignando Proyectos ---");
        Proyecto proyectoAna = new Proyecto("Sistema de Gestión Académica", estudiante1);
        estudiante1.asignarProyecto(proyectoAna);
        profesor1.dirigirProyecto(proyectoAna);

        // 6. Mostrar la información consolidada
        System.out.println("\n--- Resumen de Información ---");
        System.out.println("Profesor: " + profesor1.getNombre());
        System.out.println("Cursos que dicta:");
        for (Curso curso : profesor1.getCursosAsignados()) {
            System.out.println("  - " + curso.getNombre() + " (" + curso.getCodigo() + ")");
            System.out.println("    Estudiantes inscritos: " + curso.getInscritos().size());
        }

        System.out.println("\nEstudiante: " + estudiante1.getNombre());
        System.out.println("Carrera: " + estudiante1.getCarrera());
        System.out.println("Proyecto de Grado: " + (estudiante1.getProyectoAsignado() != null ? estudiante1.getProyectoAsignado().getTitulo() : "Ninguno"));
        System.out.println("Dirigido por: " + profesor1.getNombre());
    }
}
