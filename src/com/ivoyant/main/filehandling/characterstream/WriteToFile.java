package com.ivoyant.filehandling.characterstream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        FileWriter mywriter=null;
        try{
           mywriter=new FileWriter("D:\\IvoyantFile.txt");
            mywriter.write("Java is a object oriented programming language");
//            in filewriter we are having append method to not to override the written content
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if(mywriter!=null){
                try{
                    mywriter.close();
                } catch (IOException e) {
                   e.printStackTrace();
                }
            }
        }
    }
}
