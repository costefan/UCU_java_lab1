package lab1_3;

public class GameManager {

    public void fight(Character c1, Character c2) {
        while (!c1.isAlive() || !c2.isAlive()) {
            c1.kick(c2);
            c2.kick(c1);
        }
    }
}
