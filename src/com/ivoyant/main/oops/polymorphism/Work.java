package com.ivoyant.oops.polymorphism;

public class Work {
    public static void main(String[] args) {
        Engineer e1=new Engineer();
        Engineer e2=new SoftwareEngineer();
        Engineer e3=new CivilEngineer();
        e1.work();
        e2.work();
        e3.work();
//        decision about method binding taken by the JVM based on object "LATE BINDING"
//        OR "RUNTIME POLYMORPHISM" OR "DYNAMIC DISPATCH"
    }
}
