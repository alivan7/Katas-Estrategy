package org.example.Kata3;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Car cannot fly");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Car cannot sail");
    }
}
