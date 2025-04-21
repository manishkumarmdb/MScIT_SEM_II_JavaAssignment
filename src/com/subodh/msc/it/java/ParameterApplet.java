package com.subodh.msc.it.java;

import java.applet.Applet;
import java.awt.Graphics;

/*
How to Compile and Run Using appletviewer
Open terminal or command prompt in the directory containing both files.
Compile the Java file:
javac ParameterApplet.java

Run the applet using appletviewer:
appletviewer ParameterApplet.java
---------------------------------------

Optionally: Use HTML File
If you want to create an external HTML file:

File: ParameterApplet.html

<html>
  <body>
    <applet code="ParameterApplet.class" width="300" height="150">
      <param name="username" value="Alice">
      <param name="course" value="Computer Science">
    </applet>
  </body>
</html>


Then run:
appletviewer ParameterApplet.html
* */

public class ParameterApplet extends Applet {
    String userName;
    String courseName;

    public void init() {
        // Get parameters from HTML or <applet> comment
        userName = getParameter("username");
        courseName = getParameter("course");

        if (userName == null)
            userName = "Guest";

        if (courseName == null)
            courseName = "Unknown Course";
    }

    public void paint(Graphics g) {
        g.drawString("Welcome, " + userName + "!", 50, 60);
        g.drawString("Enrolled Course: " + courseName, 50, 90);
    }
}

