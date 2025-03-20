package com.ivoyant.main.collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();

            // Adding elements
            set.add("Apple");
            set.add("Banana");
            set.add("Cherry");
            set.add("Apple"); // Duplicate (won't be added)

            System.out.println("HashSet: " + set);

            // Check if an element exists
            System.out.println("Contains 'Banana' " + set.contains("Banana"));

            // Remove an element
            set.remove("Banana");
            System.out.println("After removing 'Banana': " + set);

            // Iterate over elements
            System.out.print("Iterating: ");
            for (String fruit : set) {
                System.out.print(fruit + " ");
            }

            // Get size of HashSet
            System.out.println("\nSize: " + set.size());

            // Clear the HashSet
            set.clear();
            System.out.println("Is empty? " + set.isEmpty());
        }
    }


