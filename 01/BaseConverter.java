import java.util.Scanner;

public class BaseConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean exit = false;
        while (!exit) {
            // Input the base of the original number
            System.out.print("Enter the base of the original number (2, 8, 10, or 16): ");
            int originalBase = scanner.nextInt();
            
            // Input the base to convert to
            System.out.print("Enter the base to convert to (2, 8, 10, or 16): ");
            int targetBase = scanner.nextInt();
            
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
    
    // Convert a number from any base to base 10
    private static int convertToDecimal(String numberStr, int base) {
        return Integer.parseInt(numberStr, base);
    }
    
    // Convert a decimal number to any base
    private static String convertFromDecimal(int decimalNumber, int base) {
        return Integer.toString(decimalNumber, base);
    }
}
