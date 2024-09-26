package lab2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex7 {
    public static void main(String[] args) {
        Program program = new Program();
        program.printResults();
    }
}

class Program {
    Scanner scanner;
    String grade;
    int mark;
    String description;

    Program() {
        scanner = new Scanner(System.in);

        try {
            mark = userInput();
        } catch (InputMismatchException e) {
            invalidInput();
        }

        try { 
            grade = calculateGrade(mark);
            description = calculateDescription(grade);
        } catch (IllegalArgumentException e) {
            invalidInput();
        }

        closeScanner();
    }

    private int userInput() {
        System.out.print("Enter assignment marks: ");
        return scanner.nextInt();
    }

    static String calculateGrade(int mark) {
        String grade;
        if (mark < 0 | mark > 100) {
            grade = "Invalid";
            throw new IllegalArgumentException("Invalid input!");
        } else if (mark > 0 && mark <= 39) {
            grade = "F";
        } else if (mark <= 49) {
            grade = "F+";
        } else if (mark <= 54) {
            grade = "D";
        } else if (mark <= 64) {
            grade = "C";
        } else if (mark <= 69) {
            grade = "B";
        } else if (mark <= 74) {
            grade = "B+";
        } else if (mark <= 79) {
            grade = "A";
        } else if (mark <= 100) {
            grade = "A+";
        } else {
            grade = "Invalid";
            throw new IllegalArgumentException("Invalid input!");
        }
        return grade;
    }

    static String calculateDescription(String grade) {
        String description;
        switch (grade) {
            case "F":
                description = "Fail";
                break;
            case "F+":
                description = "Marginal Fail";
                break;
            case "D", "C":
                description = "Pass";
                break;
            case "B", "B+":
                description = "Credit";
                break;
            case "A", "A+":
                description = "Distinction";
                break;
            default:
                description = "Invalid";
                throw new IllegalArgumentException("Invalid input!");
        }
        return description;
    }

    static void printResults(int mark, String grade, String description) {
        String article;
        switch (grade) {
            case "A", "A+":
                article = "an";
                break;
            default:
                article = "a";
                break;
        }

        System.out.println("You got " + article + " " + grade + ", which is a " + description);
    }

    void printResults() {
        printResults(mark, grade, description);
    }

    void invalidInput() {
        System.out.println("Invalid input!");
        closeScanner();
        System.exit(0);
    }

    void closeScanner() {
        scanner.close();
    }
}
