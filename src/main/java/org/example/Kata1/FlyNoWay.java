package org.example.Kata1;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("do nothing - cant fly");
    }
}
