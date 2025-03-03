import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int sum = 0, originalNumber = number;
        
        // Calculate sum of digits
        while (originalNumber != 0) {
            sum += originalNumber % 10; // Add last digit to sum
            originalNumber /= 10; // Remove last digit
        }
        
        // Check if number is divisible by sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}
