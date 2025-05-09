package org.example.Kata3;

public class Plane implements Vehicle{
    @Override
    public void drive() {
        throw new UnsupportedOperationException("Plane cannot drive on land");
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Plane cannot sail");
    }
}
