package md.tekwill.classwork.flowcontrol;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your grade (A, B, C, D, E or F): ");
        String userGrade = in.nextLine();

        switch (userGrade) {
            case "A":
                //userGrade.equals("A") ? -> : <-
            case "B":
            case "C":
            case "D":
            case "E":
                System.out.println("Congratulations! You've passed the exam!");
                break;
            case "F":
                System.out.println("Uh oh! Seems that you've failed this exam!");
                break;
            default:
                System.out.println("Sorry, I don't know this type of grading");
        }

        //exactly as the example above, but with equals; notice switch improves readability
        if (userGrade.equals("A")
                || userGrade.equals("B")
                || userGrade.equals("C")
                || userGrade.equals("D")
                || userGrade.equals("E")) {
            System.out.println("Congratulations! You've passed the exam!");
        } else if (userGrade.equals("F")) {
            System.out.println("Uh oh! Seems that you've failed this exam!");
        } else {
            System.out.println("Sorry, I don't know this type of grading");
        }
    }
}
