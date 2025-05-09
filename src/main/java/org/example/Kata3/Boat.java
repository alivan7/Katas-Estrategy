package org.example.Kata3;

public class Boat implements Vehicle{
    @Override
    public void drive() {
        throw new UnsupportedOperationException("Boat cannot drive");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Boat cannot fly");
    }

    @Override
    public void sail() {
        System.out.println("Boat is sailing");
    }
}
