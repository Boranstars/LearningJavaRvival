package com.boranstars.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Students> set = new LinkedHashSet<>();

        set.add(new Students("Alice",20,123));
    }
}
