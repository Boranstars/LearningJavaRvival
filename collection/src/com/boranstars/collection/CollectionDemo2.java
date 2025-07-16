package com.boranstars.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        System.out.println(list.size());

        list.remove("Java");
        System.out.println(list);

        System.out.println(list.contains("Java"));

        System.out.println(list.isEmpty());

//        list.clear();
        System.out.println(list);

        var arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr2 = list.toArray(String[]::new);
    }
}
