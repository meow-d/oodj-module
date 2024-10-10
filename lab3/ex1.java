package lab3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly interest: " + account.getBalance() * account.getAnnualInterestRate() / 12);
        System.out.println("Date created: " + new java.util.Date());

        Scanner scanner = new Scanner(System.in);
        scannerLoop: while (true) {
            System.out.print("\nEnter 1 to withdraw, 2 to deposit, 0 to exit: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(scanner.nextDouble());
                    System.out.println("Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(scanner.nextDouble());
                    System.out.println("Balance: " + account.getBalance());
                    break;

                case 0:
                    break scannerLoop;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        scanner.close();
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double Rate) {
        this.annualInterestRate = Rate;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
