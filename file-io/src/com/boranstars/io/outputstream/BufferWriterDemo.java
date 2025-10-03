package com.boranstars.io.outputstream;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file-io/resources/file/write.txt", true));) {
            writer.write("Hello World");
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
