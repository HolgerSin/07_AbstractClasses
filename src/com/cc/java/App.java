package com.cc.java;

import java.lang.Thread.State;

public class App {
    public static void main(String[] args) {
      // to do
      Rectangle rectangle = new Rectangle(10, 10);
      Circle circle = new Circle(5);
      Circle circle2 = new Circle(1);
      Triangle triangle = new Triangle(10, 5);


      ausgabe("Fläche Rechteck: " + rectangle.area());

      ausgabe("Fläche Kreis: " + circle.area());
      ausgabe("Fläche Kreis2: " + circle2.area());
      
      ausgabe("Fläche Dreieck: " + triangle.area());
      
      ausgabe("Diff. r-t: " + areaDiff(rectangle, triangle));
      ausgabe("Diff. r-c: " + areaDiff(rectangle, circle));
      ausgabe("Diff. c-t: " + areaDiff(circle, triangle));


    }
    
    

    static double areaDiff(Shape s1, Shape s2){
      return s1.area() - s2.area();
    }
    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
