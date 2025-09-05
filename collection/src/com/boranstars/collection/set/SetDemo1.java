package com.boranstars.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<Students> set = new HashSet<>();

        set.add(new Students("Alice",20,123));
        set.add(new Students("Bob",20,1234));
        set.add(new Students("Carl",20,1235));
        set.add(new Students("David",20,1236));
        set.add(new Students("Emma",20,1237));

        set.add(new Students("Alice",20,123)); // set虽然是无序的，但是如果不重写hashCode和equal方法，比较的还是地址


        // 重写之后，才会去除重复值
        System.out.println(set);


    }
}
