package md.tekwill.classwork.flowcontrol.whileloop;

import java.util.Random;
import java.util.Scanner;

public class DoWhileMenuExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exitSelected = false;
        do {
            displayMenuToUser();
            System.out.print("Please select an option:\n >> ");
            String selectedOption = in.nextLine();
            if (selectedOption.equalsIgnoreCase("exit")) {
                exitSelected = true;
            } else {
                executeOption(selectedOption);
            }
        } while (!exitSelected);
    }

    static void displayMenuToUser() {
        System.out.println("\tMENU");
        System.out.println("[hey] - prints a greeting");
        System.out.println("[fact] - prints an interesting fact");
        System.out.println("[random-number] - prints a random number between 0 - 10");
        System.out.println("[guess-weather] - try to guess if tomorrow will rain");
        System.out.println("[exit] - exits this app");
    }

    static void executeOption(String option) {
        Random random = new Random();
        switch (option.toLowerCase()) {
            case "hey":
                System.out.println("Hey there friend!");
                break;
            case "fact":
                System.out.println("An interesting fact about Java: " +
                                           "\n\t\"Java was named Oak before becoming Java\"");
                break;
            case "random-number":
                System.out.println("There's a random number: " + random.nextInt(10));
                break;
            case "guess-weather":
                System.out.println(random.nextBoolean()
                                           ? "Tomorrow it will rain!"
                                           : "Tomorrow we will have a wonderful weather!");
                break;
            default:
                System.out.println("I don't know this option yet!");
        }
    }

}
