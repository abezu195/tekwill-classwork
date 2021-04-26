package md.tekwill.homeworksolutions.homework2004;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExtrasensoryPerceptionGame {

    private static final Random RANDOM = new Random();
    private static final String[] COLORS = {"Red", "Green", "Blue", "Orange", "Yellow"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countOfCorrectColorGuess = 0;

        for (int i = 0; i < 10; i++) {
            String computerChosenColor = getRandomColor();
//            String computerChosenColor = getRandomColorUsingSwitch(); same thing, only using switch

            System.out.println("Please guess the color the computer has chosen from the list of colors " + Arrays.toString(COLORS));
            String userChosenColor = in.nextLine();

            if (userChosenColor.equalsIgnoreCase(computerChosenColor)) {
                System.out.println("We have a match!");
                countOfCorrectColorGuess++;
            }
        }

        System.out.println("User has correctly guessed the selected color " + countOfCorrectColorGuess + " time(s)!");
    }

    private static String getRandomColor() {
        int index = RANDOM.nextInt(COLORS.length);
        return COLORS[index];
    }

    private static String getRandomColorUsingSwitch() {
        int randomNumberBetweenZeroAndFour = RANDOM.nextInt(5);
        switch (randomNumberBetweenZeroAndFour) {
            case 0:
                return "Red";
            case 1:
                return "Green";
            case 2:
                return "Blue";
            case 3:
                return "Orange";
            case 4:
                return "Yellow";
            default:
                return "unknown";
        }
    }
}
