package com.boranstars.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        // 获取Stream流
        Collection<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        // map类不是collection的子集，无法直接获得流，可以获得键流、值流，键值对流
        Map<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        // 数组的Stream
        String[] strings = { "A", "B", "C" };
        Stream<String> stringStream = Arrays.stream(strings);
        System.out.println(stringStream.count());
        Stream<String> stringStream1 = Stream.of(strings);
    }
}
