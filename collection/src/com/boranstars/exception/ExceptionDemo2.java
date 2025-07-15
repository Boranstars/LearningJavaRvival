package com.boranstars.exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        try {
            System.out.println(div(10,0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Arithmetic Exception");
        }
    }

    public static int div(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return a / b;
    }
}
