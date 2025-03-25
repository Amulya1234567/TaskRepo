package com.ivoyant.filehandling.characterstream.largefile;

import java.io.*;

public class BufferRead {
    public static void main(String[] args) {
        BufferedReader br=null;
        String s;
        try{
            br=new BufferedReader(new FileReader("D:\\largetextfile.txt"));
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if(br!=null){
                try{
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
