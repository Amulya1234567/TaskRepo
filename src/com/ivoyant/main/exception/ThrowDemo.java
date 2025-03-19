package com.ivoyant.exception;

public class ThrowDemo {
//    public static void validateAge(int age) throws IllegalArgumentException{
//        if (age < 0 || age > 150) {
//            throw new IllegalArgumentException("Age must be between 0 and 150.");
////            throw which is used to create object of exception
//        }
//        System.out.println("Age is valid: " + age);
//    }
//
//    public static void main(String[] args) {
//        try {
//            validateAge(25);
//            validateAge(-5); // This will throw an IllegalArgumentException
//            validateAge(160); //This will also throw an IllegalArgumentException
//        } catch (IllegalArgumentException e) {
//            // Handle the exception gracefully
//            System.out.println("Error");
//            // Optionally, you can log the error, provide a user-friendly message, etc.
//        }
//
//    }


//Creating custom/user-defined exception

public static void validateAge(int age) throws InvalidAgeException{
    if (age < 0 || age > 150) {
        throw new InvalidAgeException("Your age age is not valid");
    }
    System.out.println("Age is valid: " + age);
}

    public static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(-5); // This will throw an IllegalArgumentException
            validateAge(160); //This will also throw an IllegalArgumentException
        } catch (InvalidAgeException e) {
            // Handle the exception gracefully
            System.out.println("Error:");
            // Optionally, you can log the error, provide a user-friendly message, etc.
        }

    }
}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
        super(s);
    }

}

