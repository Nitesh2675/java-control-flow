import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        int originalNumber = Math.abs(number); // Handle negative numbers
        
        // If number is 0, it has 1 digit
        if (originalNumber == 0) {
            count = 1;
        } else {
            while (originalNumber != 0) {
                originalNumber /= 10; // Remove last digit
                count++; // Increase count
            }
        }
        
        System.out.println("Number of digits: " + count);
    }
}
