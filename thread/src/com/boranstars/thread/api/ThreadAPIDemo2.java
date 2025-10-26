package com.boranstars.thread.api;

public class ThreadAPIDemo2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
