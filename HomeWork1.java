package com.javacursor.lecture1;

public class HomeWork1 {
    public static void main(String[] args) {

        byte a = 5;
        short b = 15;
        int e = 25;
        long c = 10000L;
        float f = 2.12f;
        double d = 25.252;
        char myChar = '\u00A9'; // for example primitive type 'char'

        int plus = a + b;
        long minus = e - b;
        double multiplication = d * f;
        long division = c / e;
        double sumValue = c + a - b * e / f; //for examples sum of all arithmetic operations

        System.out.println("plus " + plus);
        System.out.println("minus " + minus);
        System.out.println("multiplication " + multiplication);
        System.out.println("division " + division);
        System.out.println("sumValue " + sumValue);
        System.out.println(myChar);
    }
}
