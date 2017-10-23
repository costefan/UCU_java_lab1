package lab1_3;

public class Hobbit extends Character {
    public CharacterConfig config;

    public Hobbit(CharacterConfig conf) {
        this.config = conf;
    }
    @Override
    public void kick(Character c) {
        System.out.println("(" + this + ")");
        System.out.println("Sorry i'm not a warrior, please dont do that");
        System.out.println("Please....");
    }
}
