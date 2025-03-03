import java.util.Scanner;

public class EmployeeBonusCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        // Checking if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;  // 5% of the salary
            System.out.println("Congratulations! You are eligible for a bonus.");
            System.out.println("Your bonus amount is: $" + bonus);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }

        scanner.close();
    }
}
