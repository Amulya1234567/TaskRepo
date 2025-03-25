package com.ivoyant.main.collections;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
        public static void main(String[] args) {
            HashMap<Integer, String> employeeMap = new HashMap<>();

            // Adding key-value pairs
            employeeMap.put(101, "Alice");
            employeeMap.put(102, "Bob");
            employeeMap.put(103, "Charlie");
            employeeMap.put(null, "David"); // One null key allowed
            employeeMap.put(104, null); // Multiple null values allowed

            System.out.println("HashMap: " + employeeMap);

            // Accessing a value by key
            System.out.println("Employee ID 102: " + employeeMap.get(102));

            // Checking if a key exists
            System.out.println("Contains key 103? " + employeeMap.containsKey(103));

            // Checking if a value exists
            System.out.println("Contains value 'Alice'? " + employeeMap.containsValue("Alice"));

            // Removing an entry
            employeeMap.remove(101);
            System.out.println("After removing key 101: " + employeeMap);

            // Iterating over entries
            System.out.println("Iterating over HashMap:");
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }

            // Checking size
            System.out.println("Size: " + employeeMap.size());

            // Clearing HashMap
            employeeMap.clear();
            System.out.println("Is empty? " + employeeMap.isEmpty());
        }
    }

