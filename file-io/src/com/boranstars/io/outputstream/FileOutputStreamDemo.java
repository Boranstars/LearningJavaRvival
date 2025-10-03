package com.boranstars.io.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("file-io/resources/file/write.txt", true)) {

            // 写入字节
            os.write('A');
            os.write('B');
            // 写入字符（数组），必须使用byte数组
            os.write("你".getBytes());
            os.write("好世界\r\n".getBytes());
            // 写入字节数组的一部分
            byte[] bytes = {0x0d,0x00,0x07,0x21};
            os.write(bytes,0,3);
            os.write(bytes,3,1);
            os.write(bytes,0,bytes.length);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
