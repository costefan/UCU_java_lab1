package lab1_3;


import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Scanner reader = new Scanner(System.in);
        System.out.println("Please print your name");
        String userName = reader.nextLine();
        System.out.println("Please print your character");
        String userCharacter = reader.nextLine();
        Character c1 = factory.createCharacter(userCharacter, userName);

        System.out.println("Please print oponent's name");
        String oponentName = reader.nextLine();
        System.out.println("Please print your character");
        String oponentCharacter = reader.nextLine();
        Character c2 = factory.createCharacter(oponentCharacter, oponentName);

        if (c1 == null || c2 == null)
            System.out.println("Finished");
        else {
            System.out.println("Fight between " + c1 + " and " + c2);

            new GameManager().fight(c1, c2);
        }
    }
}
