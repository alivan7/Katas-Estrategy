package org.example.Kata1;

public class ModelDuck extends Duck{


    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Im a model duck");

    }
}
