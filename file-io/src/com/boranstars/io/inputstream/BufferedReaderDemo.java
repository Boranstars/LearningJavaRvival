package com.boranstars.io.inputstream;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("file-io/resources/file/test.html");
                BufferedReader br = new BufferedReader(fr);
        ) {

//            char[] buffer = new char[1024];
//            int len; // 每次读了多少个
//            while ((len = br.read(buffer)) != -1) {
//                System.out.print(new String(buffer, 0, len));
//            }

//            br.lines().forEach(System.out::println);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
