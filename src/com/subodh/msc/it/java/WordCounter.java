package com.subodh.msc.it.java;

import java.util.Scanner;

public class WordCounter {

    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Split the text using whitespace as delimiter
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Count words
        int wordCount = countWords(inputText);

        // Display result
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}

