package org.example.Kata1_Refactorized;

public class Bird implements Flyable,Runnable{
    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void run() {
        System.out.println("Bird running...");
    }
}
