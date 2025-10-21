package Actividades.Ejercicio5Five;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Probando SafeCalculator ---");
        SafeCalculator calculator = new SafeCalculator(0, 0); // Instance can be reused

        // --- Test Case 1: Valid Division ---
        System.out.println("\n--- Case 1: Valid Division (10 / 2) ---");
        try {
            double result = calculator.divide(10, 2);
            System.out.println("Result: " + result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        // --- Test Case 2: Division by Zero ---
        System.out.println("\n--- Case 2: Division by Zero (5 / 0) ---");
        try {
            double result = calculator.divide(5, 0);
            System.out.println("Result: " + result); // This line won't be reached
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        // --- Test Case 3: Negative Input ---
        System.out.println("\n--- Case 3: Negative Input (-8 / 4) ---");
        try {
            double result = calculator.divide(-8, 4);
            System.out.println("Result: " + result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
