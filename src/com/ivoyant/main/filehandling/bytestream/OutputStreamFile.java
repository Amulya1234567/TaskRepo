package com.ivoyant.filehandling.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamFile {
    public static void main(String[] args) {
        byte[] b={'c','B'};
        FileOutputStream fo=null;
        try{
            fo=new FileOutputStream("D:\\IvoyantFile.txt",true);
            fo.write(b);
//            In Outputstream we are not having append method instead we need to pass true as a parameter
//            inside object
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fo!=null){
                try{
                    fo.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
