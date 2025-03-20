package com.ivoyant.exception;

public class ThrowsDemo {
    static void div(int n)throws ArithmeticException
//            this method is not handling the exception
//            it is used to deligate the exception to the caller of the method
//            throws is used to indicate multiple exception
    {
        int i=100;
        double res=i/n;
        System.out.println("result "+res);
    }

    public static void main(String[] args) {
        try{
            div(5);
            div(0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
