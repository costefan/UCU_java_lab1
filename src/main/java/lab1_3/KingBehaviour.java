package lab1_3;

import java.util.Random;

public class KingBehaviour {

    public int getKingDecreasingPower(Character c) {
        Random rand = new Random();
        int power = c.getPower();

        return rand.nextInt(power);
    }
}
