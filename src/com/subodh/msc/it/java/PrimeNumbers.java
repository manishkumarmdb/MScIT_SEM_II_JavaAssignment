package com.subodh.msc.it.java;

import java.util.Scanner;

public class PrimeNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // Newline after the list
        scanner.close();
    }
}

