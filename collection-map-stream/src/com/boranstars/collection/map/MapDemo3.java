package com.boranstars.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        // map集合的遍历方式
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put(null, null);

        // 1、获取map的所有key的集合，再根据key找value
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }

        // 2、 键值对遍历
        Set<Map.Entry<String, Integer>> entries = map.entrySet(); // 先转为一个entrySet
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //3、lambda
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String k, Integer v) {
//                System.out.println(k + ": " + v);
//            }
//        });
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println(map.replace("E", 6));
    }
}
