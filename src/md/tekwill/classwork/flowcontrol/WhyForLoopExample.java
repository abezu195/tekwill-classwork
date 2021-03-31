package md.tekwill.classwork.flowcontrol;

import java.util.Scanner;

public class WhyForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        System.out.print("Give me the first number: ");
        number[0] = scanner.nextInt();
        System.out.print("Give me the second number: ");
        number[1] = scanner.nextInt();
        System.out.print("Give me the third number: ");
        number[2] = scanner.nextInt();
        System.out.print("Give me the fourth number: ");
        number[3] = scanner.nextInt();
        System.out.print("Give me the fifth number: ");
        number[4] = scanner.nextInt();

    }
}
