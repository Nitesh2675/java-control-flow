import java.util.Scanner;

public class OddEvenNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if input is a natural number (greater than 0)
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            System.out.println("Odd and Even numbers from 1 to " + number + ":");

            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        scanner.close();
    }
}
