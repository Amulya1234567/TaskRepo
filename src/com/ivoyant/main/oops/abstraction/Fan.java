package com.ivoyant.oops.abstraction;

public class Fan implements Srcombo{
    @Override
    public void increaseSpeed() {
        System.out.println("Speed increased");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Speed decreased");
    }

    @Override
    public void sOn() {
        System.out.println("Switch On");
    }

    @Override
    public void sOff() {
        System.out.println("Switch Off");
    }
}
