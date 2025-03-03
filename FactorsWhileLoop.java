import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            // Using a while loop to find factors
            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++; // Increment the counter
            }
            System.out.println(); // Move to the next line after printing factors
        }

        scanner.close();
    }
}
