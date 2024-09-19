package lab2;

import java.util.Scanner;

public class Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char myChar = '\n';
        int myNumber;

        while (true) {
            System.out.print("Pwease entwr a number: ");
            String user_input = scanner.nextLine();

            try {
                myNumber = Integer.parseInt(user_input);
            } catch (Exception e) {
                System.out.println("uwu sowwy, that's not a number. pwease twy again.");
                scanner.close();
                break;
            }
            boolean isEven = (myNumber % 2) == 0;

            if (isEven) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
            System.out.print(myChar);
        }
    }
}
