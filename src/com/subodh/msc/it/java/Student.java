package com.subodh.msc.it.java;

public class Student {

    String name;
    int age;

    // Constructor Overloading

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with name
    public Student(String name) {
        this.name = name;
        this.age = 18; // default age
    }

    // Constructor with name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method Overloading

    // Method with no parameters
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method with 1 parameter
    public void displayInfo(String course) {
        System.out.println("Name: " + name + ", Enrolled in: " + course);
    }

    // Overloaded method with 2 parameters
    public void displayInfo(String course, int year) {
        System.out.println("Name: " + name + ", Course: " + course + ", Year: " + year);
    }

    // Main method
    public static void main(String[] args) {
        // Using different constructors
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 22);

        // Display info using overloaded methods
        s1.displayInfo();                         // Method 1
        s2.displayInfo("Computer Science");       // Method 2
        s3.displayInfo("Engineering", 3);         // Method 3
    }
}

