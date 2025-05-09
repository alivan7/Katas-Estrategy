package org.example.Kata5_Refactorized;

public class SmartLight implements PowerControllable, WiFiConnectable{
    @Override
    public void turnOn() {
        System.out.println("Luz inteligente encendida");
    }

    @Override
    public void turnOff() {
        System.out.println("Luz inteligente apagada");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Luz inteligente conectada a WiFi");
    }
}
