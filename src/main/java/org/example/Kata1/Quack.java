package org.example.Kata1;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("implements duck quacking");
    }
}
