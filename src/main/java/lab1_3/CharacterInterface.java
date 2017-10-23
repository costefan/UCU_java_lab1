package lab1_3;

public interface CharacterInterface {
    void kick(Character c);
    boolean isAlive();
    int getPower();

    void decreaseHealth(int somePoints);

    void decreaseAllHealth();
}
