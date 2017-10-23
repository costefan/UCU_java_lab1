package lab1_3;

import java.util.Random;

public class KnightConfig extends CharacterConfig {
    static int power, healthPoints;
    static {
        Random rand = new Random();
        power = rand.nextInt(10) + 2;
        healthPoints = rand.nextInt(10) + 2;
    }
}
