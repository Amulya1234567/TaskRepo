package com.ivoyant.main.collections;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
        public static void main(String[] args) {
            TreeMap<Integer, String> employeeMap = new TreeMap<>();
            employeeMap.put(301, "Ian");
            employeeMap.put(303, "Jack");
            employeeMap.put(302, "Kelly");
            employeeMap.put(304, null); // Multiple null values allowed
            System.out.println("TreeMap (Sorted by Key): " + employeeMap);

            // Accessing first and last entry
            System.out.println("First Entry: " + employeeMap.firstEntry());
            System.out.println("Last Entry: " + employeeMap.lastEntry());

            // Removing an entry
            employeeMap.remove(303);
            System.out.println("After removing key 303: " + employeeMap);

            // Iterating over entries
            System.out.println("Iterating over TreeMap:");
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }

            // Checking size
            System.out.println("Size: " + employeeMap.size());

        }
    }


