package md.tekwill.homeworksolutions.homework1404;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();

        int computerScore = 0;
        int userScore = 0;

        for (int i = 0; i < 10; i++) {
            int computerDie = random.nextInt(6) + 1;
            int userDie = random.nextInt(6) + 1;

            if (computerDie > userDie) {
                computerScore++;
                System.out.println("Round " + (i + 1) + " is won by computer!");
            } else if (userDie > computerDie) {
                userScore++;
                System.out.println("Round " + (i + 1) + " is won by user!");
            } else {
                System.out.println("Round " + (i + 1) + " is a tie!");
            }
        }

        if (computerScore == userScore) {
            System.out.println("There is no grand winner! This game is a tie!");
        } else {
            String grandWinner = computerScore > userScore ? "computer" : "user";
            System.out.println("The grand winner is " + grandWinner + "!");
        }

    }
}
