package com.ivoyant.main.String;

public class StringExample {
        public static void main(String[] args) {
            //  String Creation
            String str1 = "Hello World!";  // String literal
            String str2 = new String("Java Programming");  // Using new keyword

            System.out.println("Original String 1: " + str1);
            System.out.println("Original String 2: " + str2);

            // String Length
            System.out.println("Length of str1: " + str1.length());

            //  Character at a specific index
            System.out.println("Character at index 7 in str1: " + str1.charAt(7));

            //  Substring Extraction
            System.out.println("Substring from index 5 in str2: " + str2.substring(5));
            System.out.println("Substring (5, 14) in str2: " + str2.substring(5, 14));

            //  String Comparison
            String str3 = "JAVA";
            String str4 = "java";
            System.out.println("Equals: " + str3.equals(str4));
            System.out.println("Equals Ignore Case: " + str3.equalsIgnoreCase(str4));

            //  Concatenation
            System.out.println("Concatenation using concat(): " + str1.concat(str2));
            System.out.println(str1);//immutable

            //  Finding Characters
            System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));
            System.out.println("Last Index of 'o' in str1: " + str1.lastIndexOf('o'));

            // Replace, ReplaceAll, ReplaceFirst
            String sentence = "Java is great, Java is powerful!";
            System.out.println("Replace 'Java' with 'Python': " + sentence.replace("Java", "Python"));
            //  Changing Case
            System.out.println("Uppercase: " + str2.toUpperCase());
            System.out.println("Lowercase: " + str2.toLowerCase());

            //  Splitting a String
            String languages = "Java,Python,C++,JavaScript";
            String[] words = languages.split(",");
            System.out.println("Split String:");
            for (String word : words) {
                System.out.println(word);
            }

            //  Checking Prefix and Suffix
            System.out.println("Starts with 'Java': " + str2.startsWith("Java"));
            System.out.println("Ends with 'ing': " + str2.endsWith("ing"));

            // Removing Whitespaces
            String str5 = "   Hello Java   ";
            System.out.println("Trimmed String: '" + str5.trim() + "'");

            // Using StringBuilder (Mutable Strings)
            StringBuilder sb = new StringBuilder("Welcome");
            sb.append(" to Java");
            System.out.println("StringBuilder result: " + sb);

            // Using StringBuffer (Thread-Safe Mutable Strings)
            StringBuffer sbf = new StringBuffer("Thread Safe");
            sbf.append(" StringBuffer");
            System.out.println("StringBuffer result: " + sbf);
        }
    }

