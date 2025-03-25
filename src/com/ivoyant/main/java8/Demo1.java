package com.ivoyant.main.java8;

public class Demo1 {

        public static void main(String[] args) {

            MyFunction myFunction = (name) -> "Hello, " + name;

            // Using the lambda expression through the functional interface
            String result = myFunction.apply("Alice");
            System.out.println(result); // Output: Hello, Alice

            MyFunction anotherFunction = (name) -> "Goodbye, " + name;

            String anotherResult = anotherFunction.apply("Bob");
            System.out.println(anotherResult); //Output: Goodbye, Bob
        }

        // Functional interface with a single abstract method that takes a String and returns a String.
        interface MyFunction {
            String apply(String name);
        }
    }

