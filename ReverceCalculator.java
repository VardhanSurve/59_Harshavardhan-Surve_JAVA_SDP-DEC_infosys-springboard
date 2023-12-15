import java.util.Scanner;

public class ReverceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Output using while loop
        System.out.println("Output(while loop):");
        reverseUsingWhileLoop(number);

        // Output using for loop
        System.out.println("\nOutput(for loop):");
        reverseUsingForLoop(number);

        // Output using do-while loop
        System.out.println("\nOutput(do-while loop):");
        reverseUsingDoWhileLoop(number);

        scanner.close();
    }

    // Method to reverse a number using while loop
    private static void reverseUsingWhileLoop(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // Method to reverse a number using for loop
    private static void reverseUsingForLoop(int number) {
        int reversed = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // Method to reverse a number using do-while loop
    private static void reverseUsingDoWhileLoop(int number) {
        int reversed = 0;
        do {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        } while (number != 0);
        System.out.println("Reversed number: " + reversed);
    }
}
