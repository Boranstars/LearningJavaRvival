package com.boranstars.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        // 通过Callable接口、futureTask创建线程

        Callable<String> c1 = new MyCallable(100);

        // 使用FutureTask包裹,其实现了Runnable接口
        FutureTask<String> futureTask1 = new FutureTask<>(c1);

        // 传递给Thread
        Thread t1 = new Thread(futureTask1);
        t1.start();

        FutureTask<String> futureTask2 = new FutureTask<>(new MyCallable(200));

        Thread t2 = new Thread(futureTask2);
        t2.start();

        try {
            System.out.println(futureTask1.get());


        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(futureTask2.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyCallable implements Callable<String> {
    private int num;
    public MyCallable(int num) {
        this.num = num;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.println(i);
        }
        return "1-"+num + "和为"  + sum;
    }
}
