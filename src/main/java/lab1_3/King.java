package lab1_3;

public class King extends Character {
    KingBehaviour behaviour = new KingBehaviour();

    public King(CharacterConfig conf, String userName) {
        super(conf, userName);
    }
    @Override
    public void kick(Character c) {
        System.out.println("(" + this + ")");
        int pointsToDecrease = behaviour.getKingDecreasingPower(c);
        System.out.println("Decreasing by " + pointsToDecrease);
        c.decreaseHealth(pointsToDecrease);
    }
}
