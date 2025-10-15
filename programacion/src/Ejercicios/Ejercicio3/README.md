# 📚 Ejercicio de HashMap - Gestión de Estudiantes

## 🎯 Objetivo
Este ejercicio demuestra el uso práctico de `HashMap` en Java para crear un sistema de gestión de estudiantes.

## 🔍 ¿Qué es HashMap?

**HashMap** es una implementación de la interfaz `Map` en Java que almacena datos en pares **clave-valor** (key-value). Es una de las estructuras de datos más útiles y eficientes.

### Características principales:
- ✅ **Acceso rápido**: O(1) promedio para operaciones de inserción, búsqueda y eliminación
- ✅ **Claves únicas**: No permite claves duplicadas
- ✅ **Permite valores nulos**: Tanto claves como valores pueden ser null (pero solo una clave null)
- ❌ **No ordenado**: No mantiene el orden de inserción
- ❌ **No es thread-safe**: No es seguro para uso concurrente

## 🏗️ Estructura del Proyecto

```
Ejercicio3/
├── Student.java          # Clase que representa un estudiante
├── StudentManager.java   # Clase que maneja el HashMap de estudiantes
├── Main.java            # Clase principal con ejemplos de uso
└── README.md            # Esta documentación
```

## 📋 Clases Explicadas

### 1. **Student.java**
```java
public class Student {
    private String name;
    private int age;
    private String major;
    // constructores, getters, setters...
}
```
Representa un estudiante con sus datos básicos.

### 2. **StudentManager.java**
```java
private HashMap<String, Student> students;
```
- **Clave (Key)**: `String` - ID único del estudiante (ej: "ST001")
- **Valor (Value)**: `Student` - Objeto estudiante completo

### 3. **Métodos principales del HashMap:**

| Método | Descripción | Complejidad |
|--------|-------------|-------------|
| `put(key, value)` | Agrega o actualiza un par clave-valor | O(1) |
| `get(key)` | Obtiene el valor asociado a una clave | O(1) |
| `remove(key)` | Elimina un par clave-valor | O(1) |
| `containsKey(key)` | Verifica si existe una clave | O(1) |
| `size()` | Obtiene el número de elementos | O(1) |
| `clear()` | Elimina todos los elementos | O(n) |
| `keySet()` | Obtiene todas las claves | O(1) |
| `values()` | Obtiene todos los valores | O(1) |

## 🚀 Ejecución del Ejercicio

```bash
# Compilar
javac -d bin src/Ejercicios/Ejercicio3/*.java

# Ejecutar
java -cp bin Ejercicios.Ejercicio3.Main
```

## 📊 Salida Esperada

El programa mostrará:
1. ✅ Agregando estudiantes al HashMap
2. 📚 Lista completa de estudiantes
3. 🔍 Búsqueda de estudiante específico
4. ✅ Verificación de existencia
5. 🎓 Búsqueda por especialidad
6. 🔑 Todas las claves (IDs)
7. ❌ Eliminación de estudiante
8. 📈 Estadísticas finales
9. 🔧 Características del HashMap
10. ✏️ Actualización de datos

## 💡 Conceptos Clave Aprendidos

### 1. **Inicialización**
```java
HashMap<String, Student> students = new HashMap<>();
```

### 2. **Agregar elementos**
```java
students.put("ST001", new Student("Ana", 20, "Ingeniería"));
```

### 3. **Recuperar elementos**
```java
Student student = students.get("ST001");
```

### 4. **Iterar sobre el HashMap**
```java
// Opción 1: Usando entrySet()
for (Map.Entry<String, Student> entry : students.entrySet()) {
    String id = entry.getKey();
    Student student = entry.getValue();
}

// Opción 2: Usando keySet()
for (String id : students.keySet()) {
    Student student = students.get(id);
}

// Opción 3: Usando values()
for (Student student : students.values()) {
    // Procesar estudiante
}
```

## 🎯 Casos de Uso Comunes

- 📚 **Sistemas de gestión**: Estudiantes, empleados, productos
- 🎮 **Caché**: Almacenar resultados computacionalmente costosos
- 🗂️ **Índices**: Crear índices rápidos para búsquedas
- 🏷️ **Configuraciones**: Parámetros clave-valor
- 📊 **Contadores**: Contar frecuencias de elementos

## ⚠️ Consideraciones Importantes

1. **Claves únicas**: Si intentas agregar una clave que ya existe, se sobrescribe el valor
2. **Orden no garantizado**: Los elementos pueden no aparecer en el orden de inserción
3. **Sincronización**: Para uso concurrente, usar `ConcurrentHashMap` o `Collections.synchronizedMap()`
4. **Memoria**: HashMap consume más memoria que un array simple

## 🔄 Alternativas a HashMap

- **LinkedHashMap**: Mantiene el orden de inserción
- **TreeMap**: Mantiene elementos ordenados por clave
- **ConcurrentHashMap**: Thread-safe para uso concurrente
- **Hashtable**: Thread-safe pero con menor rendimiento

¡Este ejercicio te da una base sólida para entender y usar HashMap en proyectos reales! 🚀
