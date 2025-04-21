package com.subodh.msc.it.java;

import java.applet.Applet;
import java.awt.Graphics;

/*
How to Compile and Run Using appletviewer
Open terminal or command prompt in the directory containing both files.
Compile the Java file:
javac SimpleApplet.java

Run the applet using appletviewer:
appletviewer SimpleApplet.java
---------------------------------------

Optionally: Use HTML File
If you want to create an external HTML file:

File: SimpleApplet.html

<html>
    <body>
        <applet code="SimpleApplet.class" width="300" height="100">
            Your browser does not support Java Applets.
        </applet>
    </body>
</html>

Then run:
appletviewer SimpleApplet.html
* */


// Applet class
public class SimpleApplet extends Applet {

    // This method is automatically called when the applet is loaded
    public void paint(Graphics g) {
        g.drawString("Hello, this is a simple Applet!", 150, 150);
    }
}

