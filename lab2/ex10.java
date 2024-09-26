package lab2;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = true;
        do {
            System.out.print("Continue the program? [yes/no]: ");
            String n = scanner.nextLine().toLowerCase();
            if (n.equals("yes") | n.equals("y")) {
                exit = true;
            } else if (n.equals("no") | n.equals("n")) {
                exit = false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        } while (exit);

        scanner.close();
    }
}
