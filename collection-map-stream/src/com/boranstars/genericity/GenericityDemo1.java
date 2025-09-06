package com.boranstars.genericity;

public class GenericityDemo1 {
    public static void main(String[] args) {
        MyArrayList<String> stringMyArrayList = new MyArrayList<>();
        stringMyArrayList.add("a");
        stringMyArrayList.add("b");
        stringMyArrayList.add("c");
        stringMyArrayList.add("d");

        System.out.println(stringMyArrayList);
        var removed = stringMyArrayList.remove("d");
        System.out.println(removed);
    }
}
