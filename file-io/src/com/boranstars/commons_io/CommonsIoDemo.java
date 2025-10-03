package com.boranstars.commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Timer;

public class CommonsIoDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            FileUtils.copyFile(new File("file-io/resources/file/bigfile.bin"),new File("file-io/resources/file/copied.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start + "ms");

        try {
            // Java提供的，默认不能复制到已经有的文件？
            Files.copy(Path.of("file-io/resources/file/bigfile.bin"),Path.of("file-io/resources/file/copied.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
