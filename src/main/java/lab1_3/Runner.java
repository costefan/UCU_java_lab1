package lab1_3;


public class Runner {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character c1 = factory.createCharacter("knight");
        Character c2 = factory.createCharacter("hobbit");
        System.out.println("Fight between " + c1 + " and " + c2);

        new GameManager().fight(c1, c2);
    }
}
