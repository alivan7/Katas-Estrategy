package org.example;

import org.example.Kata5_Refactorized.SmartLight;
import org.junit.jupiter.api.Test;

public class SmartLightTest {
    @Test
    public void testLightFunctions() {
        SmartLight light = new SmartLight();
        light.turnOn();
        light.connectToWiFi();
        light.turnOff();
    }
}
