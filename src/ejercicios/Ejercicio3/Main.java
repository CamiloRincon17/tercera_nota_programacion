package ejercicios.Ejercicio3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentManager manager = new StudentManager();
    
    public static void main(String[] args) {
        System.out.println("🎓 EJERCICIO DE HASHMAP - GESTIÓN DE ESTUDIANTES");
        System.out.println("=" + "=".repeat(60));
        
        boolean continuar = true;
        
        while (continuar) {
            mostrarMenu();
            int opcion = leerEntero("Selecciona una opción: ");
            
            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    buscarEstudiante();
                    break;
                case 3:
                    eliminarEstudiante();
                    break;
                case 4:
                    mostrarTodosEstudiantes();
                    break;
                case 5:
                    buscarPorEspecialidad();
                    break;
                case 6:
                    mostrarEstadisticas();
                    break;
                case 7:
                    actualizarEstudiante();
                    break;
                case 8:
                    mostrarCaracteristicasHashMap();
                    break;
                case 9:
                    continuar = false;
                    System.out.println("👋 ¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("❌ Opción no válida. Intenta de nuevo.");
            }
            
            if (continuar) {
                System.out.println("\n" + "=".repeat(50));
                System.out.println("Presiona Enter para continuar...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("\n📋 MENÚ PRINCIPAL:");
        System.out.println("1️⃣  Agregar estudiante");
        System.out.println("2️⃣  Buscar estudiante por ID");
        System.out.println("3️⃣  Eliminar estudiante");
        System.out.println("4️⃣  Mostrar todos los estudiantes");
        System.out.println("5️⃣  Buscar por especialidad");
        System.out.println("6️⃣  Mostrar estadísticas");
        System.out.println("7️⃣  Actualizar datos de estudiante");
        System.out.println("8️⃣  Características del HashMap");
        System.out.println("9️⃣  Salir");
    }
    
    private static void agregarEstudiante() {
        System.out.println("\n➕ AGREGAR ESTUDIANTE:");
        
        String id = leerString("Ingresa el ID del estudiante (ej: ST001): ");
        
        // Verificar si el ID ya existe
        if (manager.containsStudent(id)) {
            System.out.println("⚠️ Ya existe un estudiante con ese ID. ¿Deseas actualizarlo? (s/n)");
            String respuesta = scanner.nextLine().toLowerCase();
            if (!respuesta.equals("s") && !respuesta.equals("si")) {
                return;
            }
        }
        
        String nombre = leerString("Ingresa el nombre: ");
        int edad = leerEntero("Ingresa la edad: ");
        String especialidad = leerString("Ingresa la especialidad: ");
        
        Student nuevoEstudiante = new Student(nombre, edad, especialidad);
        manager.addStudent(id, nuevoEstudiante);
        
        System.out.println("✅ Estudiante agregado exitosamente!");
    }
    
    private static void buscarEstudiante() {
        System.out.println("\n🔍 BUSCAR ESTUDIANTE:");
        
        String id = leerString("Ingresa el ID del estudiante a buscar: ");
        Student estudiante = manager.getStudent(id);
        
        if (estudiante != null) {
            System.out.println("✅ Estudiante encontrado:");
            System.out.println("   " + estudiante);
        } else {
            System.out.println("❌ No se encontró un estudiante con ID: " + id);
        }
    }
    
    private static void eliminarEstudiante() {
        System.out.println("\n❌ ELIMINAR ESTUDIANTE:");
        
        String id = leerString("Ingresa el ID del estudiante a eliminar: ");
        
        // Mostrar datos del estudiante antes de eliminar
        Student estudiante = manager.getStudent(id);
        if (estudiante != null) {
            System.out.println("Estudiante a eliminar: " + estudiante);
            System.out.println("¿Estás seguro? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            
            if (respuesta.equals("s") || respuesta.equals("si")) {
                manager.removeStudent(id);
            } else {
                System.out.println("Operación cancelada.");
            }
        } else {
            System.out.println("❌ No se encontró un estudiante con ID: " + id);
        }
    }
    
    private static void mostrarTodosEstudiantes() {
        System.out.println("\n📚 MOSTRAR TODOS LOS ESTUDIANTES:");
        manager.showAllStudents();
    }
    
    private static void buscarPorEspecialidad() {
        System.out.println("\n🎓 BUSCAR POR ESPECIALIDAD:");
        
        String especialidad = leerString("Ingresa la especialidad a buscar: ");
        manager.findStudentsByMajor(especialidad);
    }
    
    private static void mostrarEstadisticas() {
        System.out.println("\n📊 ESTADÍSTICAS:");
        System.out.println("Total de estudiantes: " + manager.getTotalStudents());
        System.out.println("IDs registrados: " + manager.getAllStudentIds());
    }
    
    private static void actualizarEstudiante() {
        System.out.println("\n✏️ ACTUALIZAR ESTUDIANTE:");
        
        String id = leerString("Ingresa el ID del estudiante a actualizar: ");
        Student estudiante = manager.getStudent(id);
        
        if (estudiante != null) {
            System.out.println("Estudiante actual: " + estudiante);
            
            System.out.println("¿Qué deseas actualizar?");
            System.out.println("1. Nombre");
            System.out.println("2. Edad");
            System.out.println("3. Especialidad");
            System.out.println("4. Todo");
            
            int opcion = leerEntero("Selecciona una opción: ");
            
            switch (opcion) {
                case 1:
                    String nuevoNombre = leerString("Nuevo nombre: ");
                    estudiante.setName(nuevoNombre);
                    break;
                case 2:
                    int nuevaEdad = leerEntero("Nueva edad: ");
                    estudiante.setAge(nuevaEdad);
                    break;
                case 3:
                    String nuevaEspecialidad = leerString("Nueva especialidad: ");
                    estudiante.setMajor(nuevaEspecialidad);
                    break;
                case 4:
                    estudiante.setName(leerString("Nuevo nombre: "));
                    estudiante.setAge(leerEntero("Nueva edad: "));
                    estudiante.setMajor(leerString("Nueva especialidad: "));
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }
            
            System.out.println("✅ Estudiante actualizado: " + estudiante);
        } else {
            System.out.println("❌ No se encontró un estudiante con ID: " + id);
        }
    }
    
    private static void mostrarCaracteristicasHashMap() {
        System.out.println("\n🔧 CARACTERÍSTICAS DEL HASHMAP:");
        System.out.println("• Acceso rápido por clave (O(1) promedio)");
        System.out.println("• No permite claves duplicadas");
        System.out.println("• Permite valores nulos");
        System.out.println("• No mantiene orden específico");
        System.out.println("• Ideal para búsquedas frecuentes");
    }
    
    // Métodos auxiliares para leer entrada
    private static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }
    
    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("❌ Por favor, ingresa un número válido.");
            }
        }
    }
}
