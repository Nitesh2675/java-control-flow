import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer (base): ");
        int number = scanner.nextInt();

        System.out.print("Enter a positive integer (exponent): ");
        int power = scanner.nextInt();

        // Check if inputs are valid
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int result = 1; // Initialize result as 1
            int counter = 0; // Counter variable

            // Using while loop to calculate power
            while (counter < power) {
                result *= number; // Multiply result by number
                counter++; // Increment counter
            }

            // Display the result
            System.out.println(number + "^" + power + " = " + result);
        }

        scanner.close();
    }
}
