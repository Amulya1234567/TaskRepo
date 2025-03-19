package com.ivoyant.main.threads;

public class DeadLockDemo {
        public static final String R1="HELLO";
        public static final String R2="HI";

        static class Task1 extends Thread {
            @Override
            public void run() {
                synchronized (R1) {  // Thread-1 locksR1 first
                    System.out.println("THREAD T1 locked R1");
                    synchronized (R2) {  // Thread-1 tries to lock lock2
                        System.out.println("THREAD T1 locked R2");
                    }
                }
            }
        }

        static class Task2 extends Thread {
            @Override
            public void run() {
                synchronized (R2) {  // Thread-2 locks R2 first
                    System.out.println("THREAD T2 locked R2");
// In this program we can avoid circular dependency by making Task2
// to synchronize R1 only initially

//                    public void run() {
//                           synchronized (R1) {  // Thread-2 locks R1 first
//                           System.out.println("THREAD T2 locked R2");

                    synchronized (R1) {  // Thread-2 tries to lock R1
                        System.out.println("THREAD T2 locked R1");
                    }
                }
            }
        }

        public static void main(String[] args) {
            Thread t1 = new Task1();
            Thread t2 = new Task2();

            t1.start();
            t2.start();
        }
    }
