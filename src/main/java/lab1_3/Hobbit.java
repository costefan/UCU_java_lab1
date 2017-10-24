package lab1_3;

public class Hobbit extends Character {

    public Hobbit(CharacterConfig conf, String userName) {
        super(conf, userName);
    }
    @Override
    public void kick(Character c) {
        System.out.println("(" + this + ")");
        System.out.println("Sorry i'm not a warrior, please dont do that");
        System.out.println("Please....");
    }
}
