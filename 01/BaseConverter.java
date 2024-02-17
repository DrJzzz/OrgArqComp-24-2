import java.util.*;

public class BaseConverter{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

    boolean exit = false;
    while (!exit) {
        int originalBase = getValidBase(scanner, "Ingresa la base del numero de origen (2, 8, 10, or 16): ");
        int targetBase = getValidBase(scanner, "Ingresa la base de la salida (2, 8, 10, or 16): ");

        System.out.print("Ingresa el numero que deseas convertir:");
        String numberStr = scanner.next();

        String result = anyToAny(numberStr, originalBase, targetBase);

        System.out.println(result);

        // Ask the user if they want to make another conversion or exit
        System.out.print("Quieres hacer otra convercion? (si/no): ");
        String choice = scanner.next();
        if (!choice.equalsIgnoreCase("si")) {
            exit = true;
        }
    }

    scanner.close();
    System.out.println("Terminando programa...");
}

static int charToInt(char c) {
	if (c >= '0' && c <= '9') return(int)c - '0';
	return(int)c - 'A' + 10;
}

static char intToChar(int num) {
	if (num >= 0 && num <= 9)
		return(char)(num + '0');
	return(char)(num - 10 + 'A');
}

static int anyToDec(String sNum, int base) {
	int res = 0;
	int multiplicador = 1;
	int len = sNum.length();
    
	for(int i=len-1; i>=0; i--) {
		if (charToInt(sNum.charAt(i)) >= base) {
			System.out.printf("Error, los digitos deben ser menores a la base");
			return -1;
		}
		res += charToInt(sNum.charAt(i)) * multiplicador;
		multiplicador = multiplicador * base;
	}
	return res;
}

static String decToAny(int base, int inputNum) {
	String res = "";
	while (inputNum > 0) {
		res += intToChar(inputNum % base);
		inputNum /= base;
	}
    StringBuilder sb = new StringBuilder(res);  
	return sb.reverse().toString();
}

static String anyToAny(String s, int a, int b) {
	int num = anyToDec(s, a);
	return  decToAny(b, num);
}

private static int getValidBase(Scanner scanner, String message) {
    int base;
    do {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Input invalido, solo se aceptan enteros");
            System.out.print(message);
            scanner.next();
        }
        base = scanner.nextInt();
        if (base != 2 && base != 8 && base != 10 && base != 16) {
            System.out.println("Input invalido, la base debe ser 2, 8, 10, o 16.");
        }
    } while (base != 2 && base != 8 && base != 10 && base != 16);
    return base;
    }
}
