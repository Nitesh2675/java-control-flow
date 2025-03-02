import java.util.Scanner;

public class SumOfNNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        int formulaSum = n * (n + 1) / 2;

        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + loopSum);
        System.out.println("Both computations match: " + (formulaSum == loopSum));
    }
}