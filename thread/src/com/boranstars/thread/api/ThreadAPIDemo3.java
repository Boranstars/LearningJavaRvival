package com.boranstars.thread.api;

public class ThreadAPIDemo3 {
    public static void main(String[] args) {

        // join
        MyThread t1 = new MyThread("t1");

        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "线程输出:" + i);
            if (i == 1) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

