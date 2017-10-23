package lab1_3;

public class Elf extends Character {
    public CharacterConfig config;

    public Elf(CharacterConfig conf) {
        this.config = conf;
    }

    @Override
    public void kick(Character c) {
        System.out.println("(" + this + ")");
        if (this.getPower() > c.getPower()) {
            System.out.println("Killing " + c);
            c.decreaseAllHealth();
        } else {
            System.out.println("Decreasing " + c + " health on 1 point");
            c.decreaseHealth(1);
        }
    }
}
