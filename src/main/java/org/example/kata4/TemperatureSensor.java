package org.example.kata4;

public class TemperatureSensor implements Sensor{
    @Override
    public double readTemperature() {
        return 98.9;
    }

    @Override
    public double readPressure() {
        throw new UnsupportedOperationException("El sensor de temperatura no puede leer la presión");
    }

    @Override
    public double readHumidity() {
        throw new UnsupportedOperationException("El sensor de temperatura no puede leer la presión");

    }
}
