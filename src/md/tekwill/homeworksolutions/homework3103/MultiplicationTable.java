package md.tekwill.homeworksolutions.homework3103;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the integer number to multiply: ");
        final int numberToMultiply = in.nextInt(); //3
        System.out.println("Please enter the number of times to multiply the number: ");
        final int timesToMultiply = in.nextInt(); // 2

        for (int i = 1; i <= timesToMultiply; i++) {
            System.out.println(numberToMultiply + " x " + i + " = " + (numberToMultiply * i));
        }
    }
}
