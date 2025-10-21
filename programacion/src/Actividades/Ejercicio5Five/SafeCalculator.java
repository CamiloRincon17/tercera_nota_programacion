package Actividades.Ejercicio5Five;

public class SafeCalculator {
    public int a;
    public int b;
    
    public SafeCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double divide(int a, int b) throws InvalidInputException {
        try {
            // 4. Check for negative numbers and throw custom exception
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Error: Numbers cannot be negative.");
            }

            // 2. Check for division by zero manually to throw ArithmeticException
            if (b == 0) {
                throw new ArithmeticException("Error: Cannot divide by zero.");
            }

            // 1. Return the result of the division
            return (double) a / b;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return Double.NaN; 
        } finally {
            System.out.println("End of operation.");
        }
    }
}
