package org.example.Kata1;

public class Fish implements Animal{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Fish can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Fish can't run");
    }
}
