package com.ivoyant.main.threads;


import java.util.concurrent.atomic.AtomicInteger;

class Counter {
//    private int count = 0;
//    Synchronized method to prevent race conditions

//    public synchronized void increment() {
//        count++;
//    }

    // Lock object to synchronize a specific block

//    private final Object lock = new Object();
//
//    public void increment() {
//        synchronized (lock) { // Synchronizing only the critical section
//            count++;
//        }
//    }

    private AtomicInteger count = new AtomicInteger(0); // Atomic variable

    public void increment() {
        count.incrementAndGet(); // Atomic operation (No locking required)
    }

    public AtomicInteger getCount() {
        return count;
    }
}


// First thread class
class MyThread1 extends Thread {
    private Counter counter;

    public MyThread1(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

// Second thread class

class MyThread2 extends Thread {
    private Counter counter;

    public MyThread2(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

// Main class
public class SynchronizationMethod {

    public static void main(String[] args) {
        Counter counter = new Counter(); // Shared object

        MyThread1 t1 = new MyThread1(counter);
        MyThread2 t2 = new MyThread2(counter);


        t1.start(); // Start thread t1
        t2.start(); // Start thread t2

        try {
            t1.join(); // Ensures t1 finishes before proceeding
            t2.join(); // Ensures t2 finishes before proceeding
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Both threads have finished execution
        System.out.println("Final count: " + counter.getCount()); // Expected output: 2000
    }
}



