package com.boranstars.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {

        // 找出所有以A为首字母，长度为5的名字
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Amely");
        list.add("Bob");
        list.add("Alex");
        list.add("Arian");

        // 1、一个个遍历
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("A") && s.length() == 5) {
                newList.add(s);
            }
        }
        System.out.println(newList);

        //2、Stream流

        // 思路：获取stream流->执行操作->得到数据
        List<String> strings = list.stream().
                filter(s -> s.startsWith("A")).
                filter(s -> s.length() == 5).
                toList();


        System.out.println(strings);
    }
}
