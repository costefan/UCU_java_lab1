package lab1_3;


public abstract class Character implements CharacterInterface {

    public CharacterConfig config;

    public void Character(CharacterConfig conf) {
        this.config = conf;
    }

    public abstract void kick(Character c);
    public boolean isAlive() {
        return config.healthPoints > 0;
    }

    public int getPower() {
        return config.power;
    }

    public void decreaseHealth(int somePoints) {
        config.healthPoints -= somePoints;
    }

    public void decreaseAllHealth() {
        config.healthPoints = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Character";
    }
}
