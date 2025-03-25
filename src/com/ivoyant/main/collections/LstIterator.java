package com.ivoyant.main.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LstIterator {
        public static void main(String[] args) {
            List<String> lst =new ArrayList<>();
            lst.add("Amulya");
            lst.add("Pramod");
            lst.add("Sanjana");
            lst.add("Bhavana");
            lst.add("Mansi");
            lst.add("Deeps");
            System.out.println(lst);

            ListIterator<String> itr=lst.listIterator();
//		Iterating in forward direction
            while(itr.hasNext()) {
                int index=itr.nextIndex();
                String s=itr.next();
                System.out.println(s + " is at index of " + index);
            }
            System.out.println();
//		Iterating in reverse direction
            while(itr.hasPrevious()) {
                int index=itr.previousIndex();
                String s=itr.previous();
                System.out.println(s + " is at index of " + index);
            }
//		modifying using set method
            itr=lst.listIterator();
            while(itr.hasNext()) {
                if(itr.next().equals("Deeps")) {
                    itr.set("danya");
                }
            }
//		System.out.println(lst);
//		removing an element
            itr=lst.listIterator();
            while(itr.hasNext()) {
                if(itr.next().equals("Mansi")) {
                    itr.remove();
                }
            }
//		System.out.println(lst);
//		adding a new element
            itr=lst.listIterator();
            while(itr.hasPrevious()) {
                if(itr.previous().equals("Sanjana")) {
                    itr.add("Abhi");
                }

            }

            System.out.println(lst);
        }


    }


