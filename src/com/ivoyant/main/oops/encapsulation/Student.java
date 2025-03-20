package com.ivoyant.oops.encapsulation;

public class Student {
    private String name;
    private int age;
    private double percentage;
//Getter and setter methods for data encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=6 && age<=40){
            this.age = age;
        }else{
            System.out.println("invalid age");
        }

    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
