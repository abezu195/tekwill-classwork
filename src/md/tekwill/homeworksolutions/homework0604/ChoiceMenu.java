package md.tekwill.homeworksolutions.homework0604;

import java.util.Scanner;

public class ChoiceMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter one of the following choices: ");
        System.out.println("c) carnivore\t\tp) pianist");
        System.out.println("t) tree\t\t\t\tg) game");
        String userChoice;
            do {
                userChoice = in.nextLine();
                switch (userChoice) {
                    case "c":
                        System.out.println("A lion is a carnivore.");
                        break;
                    case "p":
                        System.out.println("Debussy is a pianist.");
                        break;
                    case "t":
                        System.out.println("A maple is a tree");
                        break;
                    case "g":
                        System.out.println("GTA V is a game.");
                        break;
                    default:
                        System.out.println("Please enter a c, p, t or g: ");
                        break;
                }
            } while (!(userChoice.equals("c") || userChoice.equals("p") || userChoice.equals("t") || userChoice.equals("g")));

//        boolean exitOptionNotSelected = true;
//        while (exitOptionNotSelected) {
//            switch (in.nextLine()) {
//                case "c":
//                    System.out.println("A lion is a carnivore.");
//                    exitOptionNotSelected = false;
//                    break;
//                case "p":
//                    System.out.println("Debussy is a pianist.");
//                    exitOptionNotSelected = false;
//                    break;
//                case "t":
//                    System.out.println("A maple is a tree");
//                    exitOptionNotSelected = false;
//                    break;
//                case "g":
//                    System.out.println("GTA V is a game.");
//                    exitOptionNotSelected = false;
//                    break;
//                default:
//                    System.out.println("Please enter a c, p, t or g: ");
//            }
//        }
    }
}
