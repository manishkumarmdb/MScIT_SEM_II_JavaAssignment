package com.subodh.msc.it.java;

import java.applet.Applet;
import java.awt.Graphics;

/*
How to Compile and Run Using appletviewer
Open terminal or command prompt in the directory containing both files.
Compile the Java file:
javac FactorialApplet.java

Run the applet using appletviewer:
appletviewer FactorialApplet.java
---------------------------------------

Optionally: Use HTML File
If you want to create an external HTML file:

FactorialApplet.html
html
Copy
Edit
<html>
    <body>
        <applet code="FactorialApplet.class" width="300" height="150"></applet>
    </body>
</html>

Then run:
appletviewer FactorialApplet.html
* */

public class FactorialApplet extends Applet {
    int number = 5; // You can change this number to compute a different factorial
    long factorial = 1;

    public void init() {
        // Compute factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
    }

    public void paint(Graphics g) {
        g.drawString("Factorial of " + number + " is: " + factorial, 50, 70);
    }
}

