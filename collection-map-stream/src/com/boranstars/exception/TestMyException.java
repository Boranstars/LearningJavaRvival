package com.boranstars.exception;

public class TestMyException {
    public static void main(String[] args) {
        try {
            saveAge(-1);
        } catch (BoranstarsFooBarException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveAge(int age) throws BoranstarsFooBarException {
        if (age < 0 || age > 114514) {
            throw new BoranstarsFooBarException("aaaaaa");
        } else {
            System.out.println("age" + age);
        }
    }
}
