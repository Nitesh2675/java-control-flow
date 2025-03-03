import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a year (1582 or later): ");
        int year = scanner.nextInt();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("Leap Year calculation is only valid for year 1582 or later.");
        } else {
            // **Approach 1: Using multiple if-else statements**
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }

            // **Approach 2: Using a single if statement with logical operators**
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Using Logical Operators: " + year + " is a Leap Year.");
            } else {
                System.out.println("Using Logical Operators: " + year + " is NOT a Leap Year.");
            }
        }

        scanner.close();
    }
}
