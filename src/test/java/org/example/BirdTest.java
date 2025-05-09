package org.example;

import org.example.Kata1_Refactorized.Bird;
import org.example.Kata1_Refactorized.Fish;
import org.junit.jupiter.api.Test;

public class BirdTest {

    @Test
    public void testBirdCanFlyAndRun() {
        Bird bird = new Bird();
        bird.fly();
        bird.run();
        // Aquí se podría usar un mock si se quiere validar la salida estándar
    }

    @Test
    public void testFishCanSwim() {
        Fish fish = new Fish();
        fish.swim();
    }
}
