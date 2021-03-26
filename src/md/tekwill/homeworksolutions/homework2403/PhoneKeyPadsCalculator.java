package md.tekwill.homeworksolutions.homework2403;

import java.util.Scanner;

public class PhoneKeyPadsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String userInputLetter = scanner.nextLine();
        int correspondingNumber = -1;

        if (userInputLetter.equalsIgnoreCase("a")
                || userInputLetter.equalsIgnoreCase("b")
                || userInputLetter.equalsIgnoreCase("c")) {
            correspondingNumber = 2;
        } else if (userInputLetter.equals(" ")) {
            correspondingNumber = 0;
        } else if (userInputLetter.equalsIgnoreCase("d")
                || userInputLetter.equalsIgnoreCase("e")
                || userInputLetter.equalsIgnoreCase("f")) {
            correspondingNumber = 3;
        }
        /*please finish up with the other cases*/
        else {
            System.out.println("You should input just a single valid letter");
        }

        if (correspondingNumber != -1) {
            System.out.println("The corresponding number is " + correspondingNumber);
        }
    }
}
