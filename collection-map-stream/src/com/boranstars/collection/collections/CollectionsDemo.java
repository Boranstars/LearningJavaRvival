package com.boranstars.collection.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c","d","111","22112"); // 批量添加
        System.out.println(list);

        // 打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
}
