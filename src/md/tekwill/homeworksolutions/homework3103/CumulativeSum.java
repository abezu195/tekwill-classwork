package md.tekwill.homeworksolutions.homework3103;

import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input an integer number");
        int sum = 0;
        for (int userNumber = scanner.nextInt(); userNumber != 0; userNumber = scanner.nextInt()) {
            sum += userNumber;
            System.out.println("The sum of all integers is : " + sum);
        }

    }
}