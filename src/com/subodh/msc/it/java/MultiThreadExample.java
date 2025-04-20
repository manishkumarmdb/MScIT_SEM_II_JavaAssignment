package com.subodh.msc.it.java;

class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread One: " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread One interrupted.");
            }
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Thread Two: " + ch);
            try {
                Thread.sleep(700); // Sleep for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread Two interrupted.");
            }
        }
    }
}

class ThreadThree extends Thread {
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Thread Three: " + i);
            try {
                Thread.sleep(600); // Sleep for 0.6 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread Three interrupted.");
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();

        t1.start();
        t2.start();
        t3.start();
    }
}

