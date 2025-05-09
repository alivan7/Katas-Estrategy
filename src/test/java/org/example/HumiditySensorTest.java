package org.example;

import org.example.Kata4_Refactorized.HumiditySensor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumiditySensorTest {
    @Test
    public void testReadHumidity() {
        HumiditySensor sensor = new HumiditySensor();
        assertEquals(60.0, sensor.readHumidity());
    }
}
