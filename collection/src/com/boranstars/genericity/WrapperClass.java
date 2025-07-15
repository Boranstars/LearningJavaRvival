package com.boranstars.genericity;

public class WrapperClass {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(1);
        Integer i2 = 2; // 自动装箱

        int i3 = i2.intValue();
        int i4 = i2; // 自动拆箱

        String ageStr = "32";
        int age = Integer.parseInt(ageStr); // 利用包装类api把字符串转数字
        double weight = Double.parseDouble("66.33");
        System.out.println(age);
        System.out.println(weight);
    }
}
