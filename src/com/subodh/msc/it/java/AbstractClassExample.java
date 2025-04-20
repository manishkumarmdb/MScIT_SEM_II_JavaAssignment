package com.subodh.msc.it.java;

// Abstract class
abstract class Employee {
    String name;
    int empId;

    // Constructor
    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Abstract method (must be implemented in subclass)
    abstract void calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID  : " + empId);
    }
}

// Subclass that extends abstract class
class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }

    // Implementation of abstract method
    @Override
    void calculateSalary() {
        System.out.println("Monthly Salary: ₹" + monthlySalary);
    }
}

// Another subclass
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    public PartTimeEmployee(String name, int empId, int hoursWorked, double ratePerHour) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    // Implementation of abstract method
    @Override
    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println("Calculated Part-Time Salary: ₹" + salary);
    }
}

// Main class
public class AbstractClassExample {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        FullTimeEmployee emp1 = new FullTimeEmployee("Manish", 101, 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Mani", 102, 40, 300);

        System.out.println("--- Full-Time Employee ---");
        emp1.displayDetails();
        emp1.calculateSalary();

        System.out.println("\n--- Part-Time Employee ---");
        emp2.displayDetails();
        emp2.calculateSalary();
    }
}

