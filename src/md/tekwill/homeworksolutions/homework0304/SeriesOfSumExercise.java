package md.tekwill.homeworksolutions.homework0304;

import java.util.Scanner;

public class SeriesOfSumExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Please enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();
        int number = 0;
        for (int i = 1; i <= numberOfTerms; ++i) {
            System.out.print((number * 10 + 9) + " + ");
            number = number * 10 + 9;
            sum += number;
        }
        System.out.println();
        System.out.println("Our sum is: " + sum);
    }

    // current number * 10 + selectedDigit
}
