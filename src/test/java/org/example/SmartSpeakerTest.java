package org.example;

import org.example.Kata5_Refactorized.SmartSpeaker;
import org.junit.jupiter.api.Test;

public class SmartSpeakerTest {
    @Test
    public void testSpeakerFunctions() {
        SmartSpeaker speaker = new SmartSpeaker();
        speaker.turnOn();
        speaker.connectToWiFi();
        speaker.playMusic();
        speaker.turnOff();
    }
}
