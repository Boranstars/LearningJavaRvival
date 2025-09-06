package com.boranstars.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Carl");
        names.add("Daniel");
        names.add("Emma");
        names.add("Fred");
        names.add("Gabriel");
        System.out.println(names);
        // 1、迭代器遍历

        // 获得迭代器
        Iterator<String> iterator = names.iterator();
        // 迭代
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2、for each
        for (String name : names) {
            System.out.println(name);
        }

        // 3、lambda
        names.forEach(System.out::println);

        // 边遍历边删除需要使用迭代器遍历删除，并且使用迭代器的remove
        for (var it = names.iterator(); it.hasNext(); ) {
            if (it.next().contains("i")) {
                it.remove();
            }
        }
        // 和以下等效
//        names.removeIf(name -> name.contains("i"));
        System.out.println(names);
    }
}
