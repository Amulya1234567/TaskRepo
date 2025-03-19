package com.ivoyant.main.threads;

import java.util.concurrent.ConcurrentHashMap;

class SharedMap {
    private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public void putValue(String key, int value) {
        map.put(key, value); // Thread-safe write operation
    }

    public Integer getValue(String key) {
        return map.get(key); // Thread-safe read operation
    }
}

public class ConcurrentMapExample {

    public static void main(String[] args) {
        SharedMap sharedMap = new SharedMap();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sharedMap.putValue("A", 100);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sharedMap.putValue("B", 200);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Value of A: " + sharedMap.getValue("A"));
        System.out.println("Value of B: " + sharedMap.getValue("B"));
    }
}



