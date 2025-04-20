package com.subodh.msc.it.java;

import java.util.Scanner;

public class FibonacciSeries {

    // Iterative method to print Fibonacci series
    public static void printFibonacciIterative(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series (Iterative): ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Recursive method to get Fibonacci number at position n
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Method to print Fibonacci series using recursion
    public static void printFibonacciRecursive(int n) {
        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms for Fibonacci series: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            printFibonacciIterative(num);
            printFibonacciRecursive(num);
        }

        scanner.close();
    }
}

