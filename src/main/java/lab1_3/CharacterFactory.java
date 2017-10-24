package lab1_3;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CharacterFactory {

    public Character createCharacter(String characterTypeName, String userName) {
        List<String> characterTypes = Arrays.asList("elf", "hobbit", "knight", "king");
        if (characterTypeName == null)
            return null;

        if (!characterTypes.contains(characterTypeName)) {
            System.out.println("Cannot find that type of character");
            return null;
        }
        characterTypeName = characterTypeName.toLowerCase();
        // sorry for that ifs - im not good at JAVA reflections to pass
        // HashMap class as value and create it on flight
        // know that it's antipattern
        if (characterTypeName.equals("elf")) {
            ElfConfig config = new ElfConfig();
            return new Elf(config, userName);
        }
        else if (characterTypeName.equals("hobbit")) {
            HobbitConfig config = new HobbitConfig();
            return new Hobbit(config, userName);
        }
        else if (characterTypeName.equals("king")) {

            Random rand = new Random();
            int power = rand.nextInt(10) + 5;
            int healthPoints = rand.nextInt(10) + 5;
            KingConfig config = new KingConfig(power, healthPoints);
            return new King(config, userName);
        }
        else if (characterTypeName.equals("knight")) {
            Random rand = new Random();
            int power = rand.nextInt(10) + 5;
            int healthPoints = rand.nextInt(10) + 5;
            KnightConfig config = new KnightConfig(power, healthPoints);
            return new Knight(config, userName);
        }

        return null;
    }
}
