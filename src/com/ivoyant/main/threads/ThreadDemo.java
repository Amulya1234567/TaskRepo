package com.ivoyant.main.threads;

import com.ivoyant.main.threads.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {

            MyThread t1=new MyThread();
            t1.start();

            Runnable runnable=new com.ivoyant.main.threads.MyRunnable();
            Thread t2=new Thread(runnable);
            t2.start();
        }
}

