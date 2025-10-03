package com.boranstars.io.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) {

        // try-with-resources
        try (InputStream is = new FileInputStream("file-io/resources/demo.txt")) {

            // 单字节读取
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
