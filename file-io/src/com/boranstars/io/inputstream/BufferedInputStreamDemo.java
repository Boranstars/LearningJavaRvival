package com.boranstars.io.inputstream;

import com.boranstars.io.filecopy.CopyDemo;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        copyFile("file-io/resources/file/bigfile.bin","file-io/resources/file/test2.txt");
        long end = System.currentTimeMillis();
        System.out.println("BufferedInputStream用时: " + (end-start) + "ms");
        start = System.currentTimeMillis();
        CopyDemo.copyFile("file-io/resources/file/bigfile.bin","file-io/resources/file/test2.txt");
        end = System.currentTimeMillis();
        System.out.println("FileStream" + ": " + (end-start) + "ms");

        // 缓冲流自带8kb缓冲区，可以减少系统调用

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
             // 使用带缓冲带高级输入输出流包裹低级流
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream(destPath);
             BufferedOutputStream bos = new BufferedOutputStream(fos)
        ){

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            bos.flush(); // 立即刷新缓冲区，同步文件
            System.out.println("Copied " + srcPath + " to " + destPath);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
