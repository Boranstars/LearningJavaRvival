package com.boranstars.file;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileSearcher {
    public static void main(String[] args) {
        File dir = new File("/Applications");
        File[] files = dir.listFiles();
        File found = searchFile(dir,"QQ.app");
        if (found != null) {
            System.out.println(found.getAbsolutePath());

            if(found.canExecute() && !found.getName().endsWith(".app")) {
                try {
                    Process process = Runtime.getRuntime().exec(found.getAbsolutePath());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.open(found);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }  else {
            System.out.println("Not Found");
        }

    }

    public static File searchFile(File dir, final String fileName) {
        if (dir == null || fileName == null || !dir.exists() || !dir.isDirectory()) {
            return null;
        }

        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    if (fileName.equals(file.getName())) {
                        System.out.println(file.getAbsolutePath());
                        return file;
                    }
                }  else if (file.isDirectory()) {
                    if (file.getName().endsWith(".app") && fileName.equals(file.getName())) {
                        return file;
                    }
                    File found = searchFile(file, fileName);
                    if (found != null) {
                        return found;
                    }
                }
            }
        }


        return null;
    }
}
