package com.ivoyant.main.collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
        public static void main(String[] args) {
            LinkedHashMap<Integer, String> employeeMap = new LinkedHashMap<>();

            // Adding key-value pairs
            employeeMap.put(201, "Eve");
            employeeMap.put(202, "Frank");
            employeeMap.put(203, "Grace");
            employeeMap.put(null, "Hannah"); // One null key allowed
            employeeMap.put(204, null); // Multiple null values allowed

            System.out.println("LinkedHashMap: " + employeeMap);

            // Removing an entry
            employeeMap.remove(202);
            System.out.println("After removing key 202: " + employeeMap);

            // Iterating over entries
            System.out.println("Iterating over LinkedHashMap:");
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }

            // Checking size
            System.out.println("Size: " + employeeMap.size());

        }
    }

