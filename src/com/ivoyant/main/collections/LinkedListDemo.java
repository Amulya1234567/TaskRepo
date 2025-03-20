package com.ivoyant.main.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> lst=new LinkedList<>();
//        List<String> names=new LinkedList<>();
        lst.add("Nikitha");
        lst.add("Ammu");
        lst.add("sindu");
        lst.set(2,"likitha");
        String first = lst.getFirst();
        String last = lst.getLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(lst);
    }
}
