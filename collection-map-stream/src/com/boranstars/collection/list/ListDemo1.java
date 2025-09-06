package com.boranstars.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {

        /* (CRUD)操作：Create、Read、Update、Delete */
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C");

        System.out.println(list);

        list.add(2,"JavaScript");
        System.out.println(list);

        System.out.println(list.removeLast());
        list.set(3,"TypeScript");
        System.out.println(list);

        var element = list.get(1);
        System.out.println(element);
        var firstElement = list.getFirst();
        System.out.println(firstElement);


        /* 遍历 */

        // 1.for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        // 2. 增强for
        for (String s : list) {
            System.out.println(s);
        }

        // 3.迭代器
        var it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 4.lambda
        list.forEach(System.out::println);
//        list.forEach(e -> System.out.println(e) );
    }


}
