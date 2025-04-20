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

public class JDBCDeleteExample {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "yourpassword"; // Replace with your actual password

        Scanner scanner = new Scanner(System.in);

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database.");

            // Get ID to delete
            System.out.print("Enter Student ID to delete: ");
            int id = scanner.nextInt();

            // Prepare DELETE statement
            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);

            // Execute update
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Student with ID " + id + " deleted successfully.");
            } else {
                System.out.println("No student found with ID " + id + ".");
            }

            // Close connection
            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

