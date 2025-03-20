package com.ivoyant.main.collections;
import java.util.TreeSet;
public class TreeSetDemo {

        public static void main(String[] args) {
            TreeSet<String> set = new TreeSet<>();

            // Adding elements
            set.add("Banana");
            set.add("Apple");
            set.add("Cherry");
            set.add("Mango");
            set.add("Apple"); // Duplicate (won't be added), Sorted order

            System.out.println("TreeSet (Sorted): " + set);

            // Checking elements
            System.out.println("Contains 'Cherry' " + set.contains("Cherry"));

            // Removing an element
            set.remove("Banana");
            System.out.println("After removing 'Banana': " + set);

            // Iterating
            System.out.print("Iterating: ");
            for (String fruit : set) {
                System.out.print(fruit + " ");
            }

            // Checking first & last elements
            System.out.println("First Element: " + set.first());
            System.out.println("Last Element: " + set.last());

            // Checking size
            System.out.println("Size: " + set.size());

        }
    }


