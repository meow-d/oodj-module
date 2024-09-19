package lab2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        userInput(scanner);
    }

    public static void userInput(Scanner scanner) {
        int number = scanner.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits is " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            // this sucks but whatever
            System.out.println(digit);
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
