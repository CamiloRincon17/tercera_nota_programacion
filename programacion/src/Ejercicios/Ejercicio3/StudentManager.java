package Ejercicios.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentManager {
    // HashMap que almacena estudiantes con su ID como clave
    // Clave: String (ID del estudiante)
    // Valor: Student (objeto estudiante)
    private HashMap<String, Student> students;
    
    // Constructor
    public StudentManager() {
        this.students = new HashMap<>();
    }
    
    /**
     * Agrega un estudiante al HashMap
     * @param studentId ID único del estudiante
     * @param student Objeto estudiante
     */
    public void addStudent(String studentId, Student student) {
        students.put(studentId, student);
        System.out.println("✅ Estudiante agregado: " + student.getName() + " (ID: " + studentId + ")");
    }
    
    /**
     * Busca un estudiante por su ID
     * @param studentId ID del estudiante a buscar
     * @return El estudiante encontrado o null si no existe
     */
    public Student getStudent(String studentId) {
        return students.get(studentId);
    }
    
    /**
     * Elimina un estudiante del HashMap
     * @param studentId ID del estudiante a eliminar
     * @return true si se eliminó, false si no existía
     */
    public boolean removeStudent(String studentId) {
        Student removed = students.remove(studentId);
        if (removed != null) {
            System.out.println("❌ Estudiante eliminado: " + removed.getName() + " (ID: " + studentId + ")");
            return true;
        } else {
            System.out.println("⚠️ No se encontró estudiante con ID: " + studentId);
            return false;
        }
    }
    
    /**
     * Verifica si existe un estudiante con el ID dado
     * @param studentId ID a verificar
     * @return true si existe, false si no
     */
    public boolean containsStudent(String studentId) {
        return students.containsKey(studentId);
    }
    
    /**
     * Obtiene el número total de estudiantes
     * @return cantidad de estudiantes
     */
    public int getTotalStudents() {
        return students.size();
    }
    
    /**
     * Muestra todos los estudiantes registrados
     */
    public void showAllStudents() {
        System.out.println("\n📚 LISTA DE ESTUDIANTES:");
        System.out.println("Total: " + getTotalStudents() + " estudiantes");
        System.out.println("=" + "=".repeat(50));
        
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        
        // Iterar sobre el HashMap usando entrySet()
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            String id = entry.getKey();
            Student student = entry.getValue();
            System.out.println("ID: " + id + " | " + student);
        }
    }
    
    /**
     * Busca estudiantes por especialidad (major)
     * @param major Especialidad a buscar
     */
    public void findStudentsByMajor(String major) {
        System.out.println("\n🔍 ESTUDIANTES DE " + major.toUpperCase() + ":");
        System.out.println("=" + "=".repeat(40));
        
        boolean found = false;
        for (Student student : students.values()) {
            if (student.getMajor().equalsIgnoreCase(major)) {
                System.out.println(student);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No se encontraron estudiantes de " + major);
        }
    }
    
    /**
     * Obtiene todas las claves (IDs) del HashMap
     * @return Set con todos los IDs
     */
    public Set<String> getAllStudentIds() {
        return students.keySet();
    }
    
    /**
     * Limpia todos los estudiantes del HashMap
     */
    public void clearAllStudents() {
        students.clear();
        System.out.println("🗑️ Todos los estudiantes han sido eliminados.");
    }
}
