package org.example.Kata5_Refactorized;

public class SmartSpeaker implements PowerControllable,WiFiConnectable,MusicPlayable{
    @Override
    public void playMusic() {
        System.out.println("Smart speaker turned on");
    }

    @Override
    public void turnOn() {
        System.out.println("Smart speaker turned off");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart speaker connected to WiFi");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Smart speaker is playing music");
    }
}
