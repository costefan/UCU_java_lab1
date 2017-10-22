package lab1_2;

public class Runner {
    public static final int MAX = 30;
    public static void main(String[] args) {
        new GuessGame(MAX).play();
        System.exit(0);
    }
}
