package com.ivoyant.main.threads;

public class MyThread extends Thread {
    @Override
    public void run()
    {
        System.out.println("Thread class: " + Thread.currentThread().getName());
    }
}



