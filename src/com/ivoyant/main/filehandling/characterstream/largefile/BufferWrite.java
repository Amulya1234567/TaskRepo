package com.ivoyant.filehandling.characterstream.largefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
    public static void main(String[] args) {
        BufferedWriter bw=null;
        try{
            bw=new BufferedWriter(new FileWriter("D:\\largetextfile.txt"));
            bw.write("Java is a high-level, object-oriented programming language " +
                    "developed by Sun Microsystems (now owned by Oracle). " +
                    "It was first released in 1995 and is widely used " +
                    "for building applications ranging from web and mobile applications to enterprise software " +
                    "and embedded systems.");
            bw.newLine();
            bw.write("Java follows the \"Write Once, Run Anywhere\" (WORA) principle, " +
                     "thanks to the Java Virtual Machine (JVM).");
            bw.newLine();
            bw.write("Multithreading – Java allows multiple threads to run concurrently, improving performance.");
            bw.newLine();
            //Write method doest not override the content
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (bw != null) {
                try{
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
