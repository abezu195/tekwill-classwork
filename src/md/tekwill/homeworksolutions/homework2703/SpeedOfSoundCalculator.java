package md.tekwill.homeworksolutions.homework2703;

import java.util.Scanner;

public class SpeedOfSoundCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a medium (\"air\", \"water\" or \"steel\"): ");
        String mediumFromUser = scanner.nextLine();
        System.out.println("Please enter the distance that the sound wave will travel in this medium: ");
        float distanceFromUser = scanner.nextFloat();
        float time = 0;

        if (mediumFromUser.equalsIgnoreCase("air")) {
            time = distanceFromUser / 1100;
        }/* please add conditions for water steel */

        if (time > 0) {
            System.out.println("The time sound needs to travel in " + mediumFromUser + " is: " + time);
        } else {
            System.out.println("You either entered a unknown medium, either a negative or zero distance.");
        }
    }
}
