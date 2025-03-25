package com.ivoyant.main.threads;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable interface: "+Thread.currentThread().getName());
    }
}
