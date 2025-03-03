import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) { // Loop from 2 to sqrt(num)
            if (num % i == 0) {
                isPrime = false;
                break; // Exit loop if num is divisible by i
            }
        }
        
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}