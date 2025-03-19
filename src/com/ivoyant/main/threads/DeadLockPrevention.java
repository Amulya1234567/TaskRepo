package com.ivoyant.main.threads;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class DeadLockPrevention {
        private static final Lock lock1 = new ReentrantLock();
        private static final Lock lock2 = new ReentrantLock();

        static class Task1 extends Thread {
            @Override
            public void run() {
                while (true) { // Keep trying until both locks are acquired
                    try {
                        if (lock1.tryLock(50, TimeUnit.MILLISECONDS)) { // Try locking lock1
                            System.out.println("THREAD T1 locked lock1");

                            try {
                                if (lock2.tryLock(50, TimeUnit.MILLISECONDS)) { // Try locking lock2
                                    try {
                                        System.out.println("THREAD T1 locked lock2");
                                        break; // Exit loop after getting both locks
                                    } finally {
                                        lock2.unlock();
                                    }
                                }
                            } finally {
                                lock1.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ignored) {} // Retry after some time
                }
            }
        }

        static class Task2 extends Thread {
            @Override
            public void run() {
                while (true) { // Keep trying until both locks are acquired
                    try {
                        if (lock2.tryLock(50, TimeUnit.MILLISECONDS)) { // Try locking lock2
                            System.out.println("THREAD T2 locked lock2");

                            try {
                                if (lock1.tryLock(50, TimeUnit.MILLISECONDS)) { // Try locking lock1
                                    try {
                                        System.out.println("THREAD T2 locked lock1");
                                        break; // Exit loop after getting both locks
                                    } finally {
                                        lock1.unlock();
                                    }
                                }
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ignored) {} // Retry after some time
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


