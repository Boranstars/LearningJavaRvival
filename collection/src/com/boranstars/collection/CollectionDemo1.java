package com.boranstars.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 1、List集合，有序可重复
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C");
        list.add("C#");
        list.add("Java");
        list.add("Python");
        System.out.println(list);
        String s = list.get(1);
        System.out.println(s);

        System.out.println("=================");

        // 2、Set集合，无序，不可重复
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("C");
        set.add("C#");
        set.add("Java");
        set.add("Python");

        System.out.println(set);
    }
}
