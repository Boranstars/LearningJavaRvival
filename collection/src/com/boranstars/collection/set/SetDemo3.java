package com.boranstars.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Students> set = new TreeSet<>((o1, o2) -> o1.getId() - o2.getId());


        set.add(new Students("Alice",20,123));
        set.add(new Students("Bob",20,1234));
        set.add(new Students("Carl",20,1235));
        set.add(new Students("David",20,1236));
        set.add(new Students("Emma",20,1237));

        System.out.println(set); // TreeSet要求元素是可比的，即实现comparable接口，或者传递比较器给TreeSet

    }
}
