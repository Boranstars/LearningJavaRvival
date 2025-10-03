package com.boranstars.file;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) {

        // 读取文件和目录
        File f1 = new File("file-io/resources/demo.txt");
        File f2 = new File("file-io/resources/pics/mainpage.png");
        File dir = new File("file-io/resources");
        System.out.println("当前工作目录: " + System.getProperty("user.dir"));
        System.out.println(f1.length());
        System.out.println(f2.length());
        System.out.println(f1.getName());
        System.out.println(dir.isDirectory());
        System.out.println(f2.isDirectory());

        // 创建文件、目录
        File f3 = new File("file-io/resources/temp");
        if (f3.exists()) {
            f3.delete();
        }
        System.out.println(f3.mkdir());
        try {
            Desktop.getDesktop().open(f3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            var path = f3.getPath();
            File f4 = new File(path + File.separator + "test.txt");
            System.out.println(f4.getPath());
            if (f4.exists()) {
                f4.delete();
            }
            f4.createNewFile();
            Thread.sleep(1000);
            deleteDir(f3);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static Boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            File[] children = dir.listFiles(); // 获取所有一级子文件对象
            if (children != null) {
                for (var child : children) {
                    System.out.println("Deleting " + child.getPath());
                    if (deleteDir(child)) {
                        System.out.println("Deleted " + child.getAbsolutePath());
                    }
                }
            }

        }

        return dir.delete();
    }
}
