package com.cc.java;

public class App {
    public static void main(String[] args) {
     
    Rectangle rectangle  = new Rectangle(10.0,10.0);
    Triangle triangle = new Triangle(10.0, 10.0);
    Circle circle = new Circle(5.0);
    
    ausgabe("------  Flächen ------");
    ausgabe("Fläche Rechteck: " + rectangle.area());
    ausgabe("Fläche Dreieck: " + triangle.area());
    ausgabe("Fläche Kreis: " + circle.area());


    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
