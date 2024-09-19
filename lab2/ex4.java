package lab2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a letter: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("bye")) {
                System.out.println("bye bye~");
                scanner.close();
                break;
            }

            if (userInput.length() > 1) {
                System.out.println("Sorry, that's not a letter. Please try again.\n");
                continue;
            }

            char character;
            character = userInput.charAt(0);

            char lowerCharacter = Character.toLowerCase(character);
            System.out.println("The lowercase of " + character + " is " + lowerCharacter + "\n");
        }

        scanner.close();
    }
}
