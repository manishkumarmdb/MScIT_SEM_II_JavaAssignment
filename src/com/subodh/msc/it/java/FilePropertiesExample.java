package com.subodh.msc.it.java;

import java.io.File;

public class FilePropertiesExample {
    public static void main(String[] args) {
        // Create File object pointing to an existing file or directory
        File file = new File("/Users/manishkumar/Downloads/MSc/MScIT_243681012_19910215_I_SEM_Result.png"); // Change the filename if needed

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Parent Directory: " + file.getParent());
            System.out.println("Is Writable? " + file.canWrite());
            System.out.println("Is Readable? " + file.canRead());
            System.out.println("Is File? " + file.isFile());
            System.out.println("Is Directory? " + file.isDirectory());
            System.out.println("File Size (bytes): " + file.length());
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

