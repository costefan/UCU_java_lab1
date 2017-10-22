package lab1_2;

import javax.swing.*;
import java.util.Random;

public class GuessGame {
    public int maxNumber;
    private int rightNumber;
    public int bestScore = 0;
    public JFrame frame;

    public GuessGame(int maxNumber) {
        this.maxNumber = maxNumber;

         createRandomNumber();
    }

    public void createRandomNumber() {
        Random rand = new Random();

        this.rightNumber = rand.nextInt(maxNumber);
    }

    public void play() {

        this.frame = new JFrame("Main frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int times = 0;
        JOptionPane.showMessageDialog(frame, "You should paste number between 0 and " + maxNumber);
        while (true) {
            if (times == 0) {
                gameDialog();
            }
            else {
                int dialogResult = JOptionPane.showConfirmDialog(frame, "Wanna try again?");

                if (dialogResult == JOptionPane.YES_OPTION) {
                    createRandomNumber();
                    gameDialog();
                } else
                    break;
            }
            times++;
        }


    }

    public void gameDialog() {
        int tries = 0;
        while (true) {
            try {
                int number = Integer.parseInt(
                        returnInputPanelResult("Please, print the number, " +
                                "Your number of tries: " + tries)
                );

                tries++;
                if (number > maxNumber || number < 0)
                    showMessage("Bad number, not in the acceptable range - (0, " +
                            maxNumber + ")", JOptionPane.WARNING_MESSAGE);


                if (number != rightNumber) {
                    if (number < rightNumber)
                        showMessage("Your number less that one that we have", JOptionPane.PLAIN_MESSAGE);
                    else
                        showMessage("Your number bigger that one that we have", JOptionPane.PLAIN_MESSAGE);
                }
                else {
                    int score = maxNumber / tries;
                    if (score > bestScore)
                        bestScore = score;
                    showMessage("Good catch, your score = " + score + "\n" +
                            "Calculated by this formula (max/tries)" + "\n\n" +
                            "Your best score is: " + bestScore, JOptionPane.PLAIN_MESSAGE
                    );

                    break;
                }

            } catch (NumberFormatException ex) {
                showMessage("Bad number, try again", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    public void showMessage(String message, int type) {
        JOptionPane.showMessageDialog(frame, message, null, type);
    }

    public String returnInputPanelResult(String message) {
        String result = JOptionPane.showInputDialog(frame, message);
        if (result == null) {
            System.exit(0);
        }
        return result;
    }
}
