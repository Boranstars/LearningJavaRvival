package com.boranstars.practice;

import java.util.HashMap;
import java.util.Map;

public class Card  implements Comparable<Card>{
    private String size;
    private String color;
    private static Map<String, Integer> rankMap = Map.ofEntries(
            Map.entry("3", 1),
            Map.entry("4", 2),
            Map.entry("5", 3),
            Map.entry("6", 4),
            Map.entry("7", 5),
            Map.entry("8", 6),
            Map.entry("9", 7),
            Map.entry("10", 8),
            Map.entry("J", 9),
            Map.entry("Q", 10),
            Map.entry("K", 11),
            Map.entry("A", 12),
            Map.entry("2", 13),
            Map.entry("小王",14),
            Map.entry("大王",15)

            );



    public Card(String size, String color) {
        this.size = size;
        this.color = color;


    }

    public Card() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return size + color;
    }

    @Override
    public int compareTo(Card o) {
//        if (this.color.equals(o.color)) {
//            return Integer.compare(rankMap.get(this.size), rankMap.get(o.size));
//        } else {
//            return this.color.compareTo(o.color);
//        }

        int sizeCompare = Integer.compare(rankMap.get(this.size), rankMap.get(o.size));
        if (sizeCompare != 0) return sizeCompare;
        return this.color.compareTo(o.color);
    }
}
