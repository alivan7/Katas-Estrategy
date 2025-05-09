package org.example.Kata5;

public class SmartLight implements SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Smart light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart light turned off");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Smart light connected to WiFi");
    }

    @Override
    public void playMusic() {
        throw new UnsupportedOperationException("Smart light can't play music");
    }
}
