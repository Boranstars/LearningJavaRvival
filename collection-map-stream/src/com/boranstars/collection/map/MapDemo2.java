package com.boranstars.collection.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 4);
        System.out.println(map.put("C", 3)); // put 会返回被覆盖的值
        map.put("D", 4);
        map.put("E", 5);
        map.put(null, null);
        System.out.println(map);


        // 基本存取方法
        System.out.println(map.get("A")); // 1
        System.out.println(map.get("A1")); // null

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("A2"));

        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue(114));

        System.out.println(map.remove("A")); // 根据key删除值会返回删除的对应值（或者null）
        System.out.println(map.remove("A1"));
        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.size());

        Set<String> keySet = map.keySet(); // 返回所有key对应的集合
        for (String key : keySet) {
            System.out.println(key + ": " + map.get(key));
        }
        Collection<Integer> values = map.values(); // 返回所有值的一个collection
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
