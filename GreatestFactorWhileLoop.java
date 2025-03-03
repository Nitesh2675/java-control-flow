import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int greatestFactor = 1; // Initialize the greatest factor
            int counter = number - 1; // Start from last but one

            // Using a while loop to find the greatest factor
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // Exit loop as soon as the largest factor is found
                }
                counter--; // Decrement counter
            }

            // Display the result
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }

        scanner.close();
    }
}
