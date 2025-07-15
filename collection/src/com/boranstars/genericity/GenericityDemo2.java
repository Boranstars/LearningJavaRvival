package com.boranstars.genericity;

import java.util.ArrayList;

public class GenericityDemo2 {
    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c"};
        Character[] charArray = {'a', 'b', 'c'};
        Integer[] intArray = {1, 2, 3};

        printArray(stringArray);
        printArray(intArray);
        printArray(charArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
