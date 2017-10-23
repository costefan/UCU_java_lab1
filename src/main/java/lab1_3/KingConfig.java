package lab1_3;

import java.util.Random;

public class KingConfig extends CharacterConfig {
    static int power, healthPoints;
    static {
        Random rand = new Random();
        power = rand.nextInt(10) + 5;
        healthPoints = rand.nextInt(10) + 5;
    }
}
