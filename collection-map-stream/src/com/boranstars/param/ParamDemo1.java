package com.boranstars.param;

import java.util.Arrays;

public class ParamDemo1 {
    public static void main(String[] args) {
        sum(1);
        sum(2,3,4); // 多个参数
//        sum(new int[]{1, 2, 3, 4}); // 数组
        sum(1,2,3,4);
        // 可以替代数组传参数
    }

    // 可变参数只能有一个，并且在形餐列表最后
    public static void sum(int ... numbers) {
        // numbers 对内实际上是一个数组
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

//        System.out.println("sum = " + );
    }
}
