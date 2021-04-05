package md.tekwill.homeworksolutions.homework0304;

import java.util.Scanner;

public class FibonacciExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();

        int current = 0, beforeCurrent = 1, nextTerm;
        for (int i = 1; i <= numberOfTerms; ++i) {
            System.out.print(current + ", ");
            nextTerm = current + beforeCurrent;
            beforeCurrent = current;
            current = nextTerm;
        }
    }
}
