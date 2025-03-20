package com.ivoyant.main.collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {


        public static void main(String[] args) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>();

            // Adding elements
            set.add(10);
            set.add(5);
            set.add(20);
            set.add(15);
            set.add(10); // Duplicate (won't be added)

            System.out.println("LinkedHashSet: " + set);

            // Checking elements
            System.out.println("Contains 20? " + set.contains(20));

            // Removing an element
            set.remove(5);
            System.out.println("After removing 5: " + set);

            // Iterating
            System.out.print("Iterating: ");
            for (int num : set) {
                System.out.print(num + " ");
            }

            // Checking size
            System.out.println("\nSize: " + set.size());

            // Clearing set
            set.clear();
            System.out.println("Is empty? " + set.isEmpty());
        }
    }

