package com.subodh.msc.it.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * Prerequisites
 * MySQL installed with a sample database (e.g., testdb) and table.
 * MySQL JDBC driver (mysql-connector-java) added to your project/classpath lib.
 * */

public class JDBCInsertExample {
    public static void main(String[] args) {
        // DB connection details
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "yourpassword"; // replace with your MySQL password

        Scanner scanner = new Scanner(System.in);

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database.");

            // Take user input
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Course Name: ");
            String course = scanner.nextLine();

            // SQL Insert query
            String query = "INSERT INTO students (id, name, course) VALUES (?, ?, ?)";

            // Use PreparedStatement to insert data
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, course);

            // Execute the query
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Student data inserted successfully!");
            }

            // Close connections
            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

