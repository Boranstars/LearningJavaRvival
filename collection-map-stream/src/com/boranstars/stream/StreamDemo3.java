package com.boranstars.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        // 学习Stream流的中间方法

        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Amely");
        list.add("Bob");
        list.add("Alex");
        list.add("Arian");

        list.stream().filter(s -> s.startsWith("B")).forEach(System.out::println);

        List<Double> numbers = new ArrayList<>();
        numbers.add(11.0);
        numbers.add(2.0);
        numbers.add(33.0);
        numbers.add(33.0);
        numbers.add(4.021);
        numbers.add(512.0);
        numbers.add(6.0);

        numbers.stream().sorted(Double::compareTo).forEach(System.out::println);
        System.out.println("---");
        numbers.stream().sorted((d1, d2) -> Double.compare(d2, d1)).
                skip(2).
                forEach(System.out::println); // 跳过前2个
        System.out.println("---");
        numbers.stream().sorted().distinct().forEach(System.out::println); // 去重（注意需要对象实现hashCode和equal）
        System.out.println("---");
        numbers.stream().map(s -> s+"d").forEach(System.out::println); //map方法对元素进行加工，并且得到新的流
        System.out.println("---");
        Stream<String> stringStream = list.stream();
        Stream<Double> doubleStream = numbers.stream();
        Stream<? extends Serializable> concated = Stream.concat(stringStream, doubleStream); //contact合并两个流，新流类型为最小公共父类型
        concated.forEach(System.out::println);
    }
}
