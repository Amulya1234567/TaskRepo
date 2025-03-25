package com.ivoyant.oops.abstraction;

public class TestFan {
    public static void main(String[] args) {
        Srcombo c = new Fan();
        c.sOn();
        c.sOff();
        c.increaseSpeed();
        c.decreaseSpeed();
    }
}
