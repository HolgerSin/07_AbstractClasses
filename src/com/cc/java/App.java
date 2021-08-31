package com.cc.java;

public class App {
    public static void main(String[] args) {
     
    Rectangle rectangle  = new Rectangle(10.0,10.0);
    

    ausgabe("Fläche Rechteck: " + rectangle.area());


    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
