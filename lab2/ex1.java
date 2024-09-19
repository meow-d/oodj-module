package lab2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a temperature in Fahrenheit: ");
            String user_input = scanner.nextLine();

            if (user_input.equals("bye")) {
                System.out.println("bye bye~");
                scanner.close();
                break;
            }

            double fahrenheit;
            try {
                fahrenheit = Double.parseDouble(user_input);
            } catch (Exception e) {
                System.out.println("Sorry, that's not a number. Please try again.\n");
                continue;
            }

            double celsius = FahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F is " + celsius + "°C.\n");
        }

        scanner.close();
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
