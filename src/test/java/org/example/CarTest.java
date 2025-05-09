package org.example;

import org.example.Kata3_Refactorized.Car;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testCarDrive() {
        Car car = new Car();
        car.drive();
    }
}
