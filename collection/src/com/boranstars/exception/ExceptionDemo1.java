package com.boranstars.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionDemo1 {

    public static void foo() throws FileNotFoundException {
        InputStream is = new FileInputStream("/home/boran/test.png");

    }

    public static void main(String[] args) {
        try {
            foo();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
