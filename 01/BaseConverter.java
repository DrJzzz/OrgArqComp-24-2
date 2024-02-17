import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            int originalBase = getValidBase(scanner, "Enter the base of the original number (2, 8, 10, or 16): ");
            int targetBase = getValidBase(scanner, "Enter the base to convert to (2, 8, 10, or 16): ");

            // Input the original number as a string
            System.out.print("Enter the number to convert (in base " + originalBase + "): ");
            String numberStr = scanner.next();

            // Convert the number to base 10 (if necessary)
            int decimalNumber = convertToDecimal(numberStr, originalBase);

            // Convert the decimal number to the target base
            String result = convertFromDecimal(decimalNumber, targetBase);

            // Output the result
            System.out.println("Result: " + result);

            // Ask the user if they want to make another conversion or exit
            System.out.print("Do you want to make another conversion? (yes/no): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                exit = true;
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }

    // Get a valid base from the user
    private static int getValidBase(Scanner scanner, String message) {
        int base;
        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                System.out.print(message);
                scanner.next(); // discard non-integer input
            }
            base = scanner.nextInt();
            if (base != 2 && base != 8 && base != 10 && base != 16) {
                System.out.println("Invalid base! Please enter 2, 8, 10, or 16.");
            }
        } while (base != 2 && base != 8 && base != 10 && base != 16);
        return base;
    }

    // Convert a number from any base to base 10
    private static int convertToDecimal(String numberStr, int base) {
        return Integer.parseInt(numberStr, base);
    }

    // Convert a decimal number to any base
    private static String convertFromDecimal(int decimalNumber, int base) {
        return Integer.toString(decimalNumber, base);
    }
}
