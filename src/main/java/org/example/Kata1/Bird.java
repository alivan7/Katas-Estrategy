package org.example.Kata1;

public class Bird implements Animal{
    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Birds can't swim");
    }

    @Override
    public void run() {
        System.out.println("Bird running...");
    }
}
