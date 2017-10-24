package lab1_3;

public class GameManager {

    public void fight(Character c1, Character c2) throws Exception {
        this.workWithExtraCases(c1, c2);

        while (true) {
            if (c1.isAlive())
                c1.kick(c2);
            else break;
            if (c2.isAlive())
                c2.kick(c1);
            else break;
        }
    }

    public void workWithExtraCases(Character c1, Character c2)  throws Exception {
        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            throw new Exception("Hobbit cannot fight Hobbit");
        }
    }
}
