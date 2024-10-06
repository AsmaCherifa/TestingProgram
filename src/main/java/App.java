
public class App {

    // Method for addition
    public int sum(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed!");
            return 0;
        }
        return (double) a / b;
    }

    // Method for modulus
    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Modulus by zero is not allowed!");
            return 0;
        }
        return a % b;
    }

    // Method for exponentiation
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    // Method for square root
    public double squareRoot(int a) {
        if (a < 0) {
            System.out.println("Square root of a negative number is not allowed!");
            return 0;
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        App app = new App();

        int x = 5;
        int y = 3;

        
        System.out.println("Sum: " + app.sum(x, y));
        System.out.println("Subtraction: " + app.subtract(x, y));
        System.out.println("Multiplication: " + app.multiply(x, y));
        System.out.println("Division: " + app.divide(x, y));
        System.out.println("Modulus: " + app.modulus(x, y));
        System.out.println("Exponentiation (5^3): " + app.power(x, y));
        System.out.println("Square Root of 25: " + app.squareRoot(25));
    }
}
