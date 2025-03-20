package com.ivoyant.main.collections;

public class Array {
        public static void main(String[] args) {
            int arr[]=new int[5];
            arr[0]=2;
            arr[1]=3;
            arr[2]=1;
            arr[3]=5;
            arr[4]=7;
//		using forloop
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
//		using foreach loop
            for (int numbers:arr) {
                System.out.print(numbers);
            }

        }

}



