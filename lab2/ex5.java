package lab2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean exit = userInput(scanner);
            if (exit) {
                break;
            }
        }

        scanner.close();
    }

    public static boolean userInput(Scanner scanner) {
        System.out.print("Input int: ");
        int code = scanner.nextInt();

        if (code == 0) {
            return true;
        }

        if (code >= 128 | code <= 0) {
            System.out.println("Invalid code");
            return false;
        }

        char character = (char) code;
        System.out.println("Character: " + character);
        return false;
    }
}
