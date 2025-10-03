package com.boranstars.io.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) {
        // 读取字节数组
        try (InputStream is = new FileInputStream("file-io/resources/file/test.txt")) {

            byte[] buffer = new byte[1024];
            int len; // 每次读了多少个
            while ((len = is.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, len,"UTF-8"));
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        try(InputStream is = new FileInputStream("file-io/resources/file/test.html")) {
            // 也可以一次读完全部
            byte[] bytes = is.readAllBytes();
            System.out.println(new String(bytes, "UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
