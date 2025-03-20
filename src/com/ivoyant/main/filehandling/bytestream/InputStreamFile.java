package com.ivoyant.filehandling.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamFile {
    public static void main(String[] args) {
        FileInputStream fi=null;
        int i;
        try{
            fi=new FileInputStream("D:\\IvoyantFile.txt");
            while((i=fi.read())!=-1){
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fi!=null){
                try{
                    fi.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
