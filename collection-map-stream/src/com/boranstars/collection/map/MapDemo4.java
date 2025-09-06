package com.boranstars.collection.map;
import com.boranstars.collection.set.Students;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<Students, String> map = new TreeMap<>();

        map.put(new Students("Alice", 21, 123),"1班");
        map.put(new Students("Bob",20, 1234),"2班");
        System.out.println(map);
    }
}
