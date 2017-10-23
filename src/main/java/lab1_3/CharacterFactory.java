package lab1_3;


public class CharacterFactory {

    public Character createCharacter(String characterTypeName) {
        if (characterTypeName == null)
            return null;

        characterTypeName = characterTypeName.toLowerCase();
        // sorry for that ifs - im not good at JAVA reflections to pass
        // HashMap class as value and create it on flight
        // know that it's antipattern
        if (characterTypeName.equals("elf")) {
            ElfConfig config = new ElfConfig();
            return new Elf(config);
        }
        else if (characterTypeName.equals("hobbit")) {
            HobbitConfig config = new HobbitConfig();
            return new Hobbit(config);
        }
        else if (characterTypeName.equals("king")) {
            KingConfig config = new KingConfig();
            return new King(config);
        }
        else if (characterTypeName.equals("knight")) {
            KnightConfig config = new KnightConfig();
            return new Knight(config);
        }

        return null;
    }
}
