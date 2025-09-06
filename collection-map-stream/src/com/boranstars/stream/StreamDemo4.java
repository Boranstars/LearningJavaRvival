package com.boranstars.stream;

import com.boranstars.collection.set.Students;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4
{
    public static void main(String[] args) {
        // 学习Stream流的终结方法，调用终结方法后，流就无法使用

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("Alice",20,123));
        studentsList.add(new Students("Bob",20,1234));
        studentsList.add(new Students("Carl",20,1235));
        studentsList.add(new Students("David",20,1236));
        studentsList.add(new Students("Emma",20,1237));

        // 终结操作
        studentsList.stream().filter(students -> students.getId() > 1234).forEach(System.out::println);
        var count = studentsList.stream().filter(students -> students.getId() > 123).count();
        System.out.println(count);
        Optional<Students> max = studentsList.stream().max(Students::compareTo);
        Students maxStudents = max.get();
        System.out.println(maxStudents);

        // 收集流
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Amely");
        list.add("Bob");
        list.add("Alex");
        list.add("Arian");

        List<Double> numbers = new ArrayList<>();
        numbers.add(11.0);
        numbers.add(2.0);
        numbers.add(33.0);
        numbers.add(33.0);
        numbers.add(4.021);

        // 收集到list
        Stream<String> stringStream = list.stream().filter(s -> s.startsWith("A"));
        List<String> stringList = stringStream.collect(Collectors.toList());
        System.out.println(stringList);

        // 收集到set
        Set<Students> studentsSet = studentsList.stream().sorted().collect(Collectors.toSet());
        Object[] arrayS = studentsList.stream().toArray();

        // 收集到map

//        Map<String, Integer> stringIntegerMap = studentsList.stream().collect(Collectors.toMap(Students::getName, Students::getId));
        Map<String, Integer> stringIntegerMap = studentsList.stream().collect(Collectors.toMap(
                new Function<Students, String>() {
                    @Override
                    public String apply(Students students) {
                        return students.getName();
                    }
                },
                new Function<Students, Integer>() {
                    @Override
                    public Integer apply(Students students) {
                        return students.getId();
                    }
                }
        ));
        System.out.println(stringIntegerMap);

        Stream<Students> studentsStream = studentsList.stream().sorted();
        Stream<Double> doubleStream = numbers.stream().sorted();

    }
}
