package org.example;


import org.example.Kata1.Duck;
import org.example.Kata1.MallardDuck;
import org.junit.jupiter.api.Test;

public class BasicPrinterTest {
    @Test
    public void testPrint() {
      Duck mallard = new MallardDuck();
        mallard.performQuak();
        mallard.performFly();
    }
}
