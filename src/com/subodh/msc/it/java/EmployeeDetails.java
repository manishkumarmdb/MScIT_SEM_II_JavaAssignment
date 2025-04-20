package com.subodh.msc.it.java;

import java.util.Scanner;

public class EmployeeDetails {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        scanner.close();

        // Creating Employee object
        EmployeeObj employee = new EmployeeObj(empId, name, salary, department);

        // Display employee details
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID       : " + employee.getId());
        System.out.println("Employee Name     : " + employee.getName());
        System.out.println("Department        : " + employee.getDepartment());
        System.out.println("Salary            : ₹" + employee.getSalary());

    }
}

class EmployeeObj {
    private int id;
    private String name;
    private double salary;
    private String department;

    public EmployeeObj(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
