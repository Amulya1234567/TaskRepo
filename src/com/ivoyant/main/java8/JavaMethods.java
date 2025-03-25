package com.ivoyant.main.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaMethods {
    /**
         * The entry point of the program.
         *
         * @param args Command-line arguments (not used).
         */
        public static void main(String[] args) {
            // --- Default Method Usage ---
            MyClass myObject = new MyClass();
            System.out.println(myObject.getDefaultMessage());

            // --- Static Method Usage ---
            System.out.println(MyInterface.staticMethod());

            // --- Lambda Expression Implementation ---
            // Implementing MyInterface using a lambda expression.
            MyInterface lambdaImplementation = (input) -> System.out.println("Lambda says: " + input);

            lambdaImplementation.myMethod("Hello, Lambda!");
            myObject.myMethod("Hello MyClass");

            // --- forEach Method with Lambda Expressions ---
            List<String> names = Arrays.asList("Amulya", "Prema", "Chaitra");

            // Simple lambda expression with forEach.
            names.forEach(name -> System.out.println("Name: " + name));

            // Method reference with forEach.
            names.forEach(System.out::println);

            // Custom Consumer implementation with forEach.
            Consumer<String> myConsumer = name -> System.out.println("Custom Consumer: " + name);
            names.forEach(myConsumer);

            // Lambda expression with a block of code.
            names.forEach(name -> {
                String upperCaseName = name.toUpperCase();
                System.out.println("Uppercase: " + upperCaseName);
            });

            // Lambda expression with a return value (inferred).
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            numbers.forEach(number -> {
                int squared = number * number;
                System.out.println(number + " squared is " + squared);
            });
        }
    }

