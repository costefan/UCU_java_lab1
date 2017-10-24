package lab1_3;

public class Knight extends Character {
    KingBehaviour behaviour = new KingBehaviour();

    public Knight(CharacterConfig conf, String userName) {
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
