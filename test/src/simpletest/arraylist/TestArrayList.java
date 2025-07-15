package simpletest.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("a");
        stringArrayList.add("basd");
        stringArrayList.add("abc");
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);
        stringArrayList.forEach(System.out::println);
        stringArrayList.remove(1);

    }
}
