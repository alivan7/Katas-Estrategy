package org.example;

import org.example.Kata4_Refactorized.PressureSensor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PressureSensorTest {
    @Test
    public void testReadPressure() {
        PressureSensor sensor = new PressureSensor();
        assertEquals(1013.25, sensor.readPressure());
    }
}
