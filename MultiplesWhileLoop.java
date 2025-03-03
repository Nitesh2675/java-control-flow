import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        // Check if the number is valid
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");

            int counter = 100; // Start from 100 and go downwards

            // Using while loop to find multiples
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--; // Decrement the counter
            }

            System.out.println(); // Move to the next line after printing multiples
        }

        scanner.close();
    }
}
