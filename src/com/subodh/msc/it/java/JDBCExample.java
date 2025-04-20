package com.subodh.msc.it.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
* Prerequisites
* MySQL installed with a sample database (e.g., testdb) and table.
* MySQL JDBC driver (mysql-connector-java) added to your project/classpath lib.
* */

public class JDBCExample {
    public static void main(String[] args) {
        // JDBC URL, username and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "yourpassword"; // replace with your MySQL password

        // SQL query
        String query = "SELECT * FROM employees";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database.");

            // Create and execute statement
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Process result set
            System.out.println("Employee Details:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Department: " + rs.getString("department"));
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

