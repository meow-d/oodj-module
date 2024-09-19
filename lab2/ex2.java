package lab2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println("the area of the cylinder is: " + calculateCylinderVolume(radius, height));

        scanner.close();
    }

    public static double calculateArea(double radius) {
        return Math.sqrt(radius) * Math.PI;
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return calculateArea(radius) * height;
    }
}
