package com.boranstars.io.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) {
        copyFile("file-io/resources/file/test.txt", "file-io/resources/file/test2.txt");
    }
    public static void copyFile(String srcPath, String destPath) {
        if (srcPath == null || destPath == null) {
            return;
        }
        if (srcPath.equals(destPath)) {
            System.out.println("源文件和目标文件相同，无需复制。");
            return;
        }
        // // try-with-resources,里面只能放资源，也就是实现了Closeable、AutoCloseable接口的
        try (FileInputStream fis = new FileInputStream(srcPath);
             FileOutputStream fos = new FileOutputStream(destPath)){

            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            fos.flush(); // 立即刷新缓冲区，同步文件
            System.out.println("Copied " + srcPath + " to " + destPath);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
