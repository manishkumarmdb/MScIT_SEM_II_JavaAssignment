package com.subodh.msc.it.java;

import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            // Possible ArithmeticException (division by zero)
            int result = a / b;
            System.out.println("Result: " + result);

            // Possible ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing 5th element: " + numbers[4]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (Exception e) {
            // Generic exception block
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes (finally).");
            scanner.close();
        }
    }
}

