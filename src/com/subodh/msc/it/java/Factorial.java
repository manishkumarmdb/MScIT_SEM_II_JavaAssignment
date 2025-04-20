package com.subodh.msc.it.java;

import java.util.Scanner;
public class Factorial {

    // Method to calculate factorial iteratively
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial recursively
    public static long factorialRecursive(int n) {
        if (n <= 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using both methods
            long resultIterative = factorialIterative(number);
            long resultRecursive = factorialRecursive(number);

            System.out.println("Factorial of " + number + " (Iterative): " + resultIterative);
            System.out.println("Factorial of " + number + " (Recursive): " + resultRecursive);
        }

        scanner.close();
    }
}

