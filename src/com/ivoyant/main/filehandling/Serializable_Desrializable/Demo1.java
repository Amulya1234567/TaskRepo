package com.ivoyant.main.filehandling.Serializable_Desrializable;
import java.io.*;
public class Demo1 {
        public static void main(String[] args) {
            try {
                // Serialization using Externalizable
                Employee s = new Employee("Amulya", 24);
                File file = new File("D:\\IvoyantFile.txt");
                ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(file));
                obj.writeObject(s);
                obj.close();

                // Deserialization using Externalizable
                ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream(file));
                Employee e1 = (Employee) obj1.readObject();
                obj1.close();

                // Corrected print statement
                System.out.println(e1.name + " " + e1.age);

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace(); // Better for debugging
            }
        }
    }

