package org.example;

import org.example.Kata4_Refactorized.TemperatureSensor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureSensorTest {
    @Test
    public void testReadTemperature() {
        TemperatureSensor sensor = new TemperatureSensor();
        assertEquals(22.5, sensor.readTemperature());
    }
}
