package com.ivoyant.main.oops.encapsulation;

public class Test {
    public static void main(String[] args) {
        com.ivoyant.oops.encapsulation.Student s =new com.ivoyant.oops.encapsulation.Student();
        s.setName("Dinga");
        s.setAge(24);
        s.setPercentage(65.5);
        System.out.println(s.getName()+" "+s.getAge()+" "+s.getPercentage());
    }
}
