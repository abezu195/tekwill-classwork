package md.tekwill.classwork.streams;

import java.util.Scanner;

public class FusionExample {
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How are you " + name + " ?");
        String answer = scanner.nextLine(); //I'm FiNe ThAnk YoU => toLowerCase() => i'm fine thank you
        if (answer.contains("fine")) {
            System.out.println("Fine! It means you can continue with your Java lessons for a little bit longer!");
        }
        else if (answer.contains("great")) {
            System.out.println("Great! It means you can continue with your Java lessons for another month!");
        }
        else if (answer.contains("bad")) {
            System.out.println("Ouch! That's not good! You must replenish your batteries before continuing with this course.");
        }
        else {
            System.out.println("Oopsy daisy! I don't know to react to such an answer.");
        }
    }
}
