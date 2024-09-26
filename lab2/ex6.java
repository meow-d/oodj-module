package lab2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();

        int days;
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;

            case 4, 6, 9, 11:
                days = 30;
                break;

            default:
                System.out.println("Invalid month");
                scanner.close();
                return;
        }

        scanner.close();

        System.out.println(days);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

}
