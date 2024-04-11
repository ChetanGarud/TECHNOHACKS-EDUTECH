import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        String operation = "";

        switch (choice) {
            case 1:
                result = num1 + num2;
                operation = "addition";
                break;
            case 2:
                result = num1 - num2;
                operation = "subtraction";
                break;
            case 3:
                result = num1 * num2;
                operation = "multiplication";
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                result = num1 / num2;
                operation = "division";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result of " + operation + " is: " + result);

        scanner.close();
    }
}
