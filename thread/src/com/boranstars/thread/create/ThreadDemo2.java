package com.boranstars.thread.create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 使用runnable接口创建线程

        // 创建线程任务
        Runnable mr = new MyRunnable();

        // 把线程任务对象交给线程对象
        Thread t1 = new Thread(mr);
        t1.start();

        // 也可以直接使用匿名内部类
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                    System.out.println("子线程2输出:" + i);
                }
            }
        });
        t2.start();

        // 当然可以简化为lambda
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                System.out.println("子线程3输出:" + i);
            }
        });
        t3.start();

        for (int i = 0; i < 10; i++) {

            System.out.println("主线程输出:" + i);
        }

        // 这种形式实现的线程无法得到返回结果
    }
}


class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程输出:" + i);
        }
    }
}
