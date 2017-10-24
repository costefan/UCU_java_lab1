package lab1_3;


public abstract class Character implements CharacterInterface {

    public String userName;
    public int power;
    private int healthPoints;

    public Character(CharacterConfig conf, String userName) {
        this.power = conf.power;
        this.healthPoints = conf.healthPoints;
        this.userName = userName;
    }

    public abstract void kick(Character c);
    public boolean isAlive() {
        if (healthPoints > 0)
            return true;

        System.out.println(this + " is dead");
        return false;
    }

    public int getPower() {
        return power;
    }

    public void decreaseHealth(int somePoints) {
        healthPoints -= somePoints;
    }

    public void decreaseAllHealth() {
        healthPoints = 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + userName;
    }
}
