package com.ivoyant.main.java8;
import java.util.Arrays;
import java.util.List;
public class Demo {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

            // Simple Lambda Expression with forEach
            names.forEach(name -> System.out.println("Hello, " + name));
        }
    }

