package com.boranstars.thread.api;



public class ThreadAPIDemo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("第一个线程");
        t1.start();
        System.out.println(t1.getName()); // 获取线程名称
        MyThread t2 = new MyThread("MyThread2");

        Runnable r1 = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread t3 = new Thread(r1, "Thread3"); // 放runnable也可以重命名

        t2.start();
        t2.setName("MyThread-2"); // 设置线程名称
        System.out.println(t2.getName());

        
        Thread mainThread = Thread.currentThread(); // 获得主线程（通过当前线程API）
        System.out.println(mainThread.getName());
    }
}


class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "子线程输出:" + i);
        }
    }
}