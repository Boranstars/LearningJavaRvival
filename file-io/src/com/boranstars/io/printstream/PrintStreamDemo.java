package com.boranstars.io.printstream;

import com.boranstars.collection.set.Students;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        try (PrintStream out = new PrintStream("file-io/resources/file/out.txt")) {
            // printstream实现打印什么就是什么
            out.println("Hello World");
            out.println("你好！");
            out.println();
            out.println(111);
            out.println("21wdsadeareqwe");
            Students s = new Students("李华",21,11100011); // 最后还是会调用toString
            out.println(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
