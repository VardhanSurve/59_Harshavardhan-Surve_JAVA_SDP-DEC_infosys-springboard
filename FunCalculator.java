import java.util.Scanner;

public class FunCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's choice
        System.out.println("Choose an option:");
        System.out.println("1. Check Armstrong Number");
        System.out.println("2. Check Lucky Number");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        // Check user choice
        switch (choice) {
            case 1:
                // Check for Armstrong Number
                System.out.print("Enter a number: ");
                int armstrongNumber = scanner.nextInt();
                if (isArmstrongNumber(armstrongNumber)) {
                    System.out.println("The number is an Armstrong number.");
                } else {
                    System.out.println("The number is not an Armstrong number.");
                }
                break;

            case 2:
                // Check for Lucky Number
                System.out.print("Enter a number: ");
                int luckyNumber = scanner.nextInt();
                if (isLuckyNumber(luckyNumber)) {
                    System.out.println("The number is a Lucky number.");
                } else {
                    System.out.println("The number is not a Lucky number.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }

    // Method to check Armstrong Number
    private static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Method to check Lucky Number
    private static boolean isLuckyNumber(int number) {
        int sumOfSquares = 0;
        int position = 1;
        while (number > 0) {
            int digit = number % 10;
            if (position % 2 == 0) {
                sumOfSquares += Math.pow(digit, 2);
            }
            position++;
            number /= 10;
        }
        return sumOfSquares % 9 == 0;
    }
}
