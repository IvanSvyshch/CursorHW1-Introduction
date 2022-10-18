package com.javacursor.lecture1;

public class HomeWork1 {

    public static void main(String[] args) {

        byte a = 10;
        short b = 25;
        long c = 100L;
        float f = 5.0f;
        double d = 15.0;

        char myChar = '\u00A9';

        int plus = a + b;
        long minus = c - a - b;
        double multiplication = f * d;
        int division =  b / a;

        double sumValue = d + f * a / b - c;

        System.out.println("plus " + plus);
        System.out.println("minus " + minus);
        System.out.println("multiplication " + multiplication);
        System.out.println("division " + division);
        System.out.println("sumValue " + sumValue);
        System.out.println(myChar);


    }
}
