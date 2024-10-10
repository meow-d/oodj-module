package lab6;

public class ex1 {
    public static void main(String[] args) {
    }
}

class MyDate {
    int year;
    int month;
    int day;
}

class Person {
    String name;
    String address;
    String phoneNumber;
    String emailAddress;

    public String toString() {
        return "Person, " + this.name;
    }
}

enum Status {
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
}

class Student extends Person {
    Status status;

    public String toString() {
        return "Student, " + this.name;
    }
}

class Employee extends Person {
    String office;
    double salary;
    MyDate dateHired;

    public String toString() {
        return "Employee, " + this.name;
    }
}

class Faculty extends Employee {
    int officeHours;
    String rank;

    public String toString() {
        return "Faculty, " + this.name;
    }
}

class Staff extends Employee {
    String title;

    public String toString() {
        return "Staff, " + this.name;
    }
}
