package com.ivoyant.main.java8;

public interface MyInterface {

        /**
         * A default method providing a default implementation.
         * Implementing classes can use this or override it.
         *
         * @return A default message.
         */
        default String getDefaultMessage() {
            return "Default message from MyInterface";
        }

        /**
         * An abstract method that must be implemented by classes implementing
         * this interface.
         *
         * @param input The input string.
         */
        void myMethod(String input);

        /**
         * A static method belonging to the interface itself.
         *
         * @return A static message.
         */
        static String staticMethod() {
            return "Static method from MyInterface";
        }
    }

