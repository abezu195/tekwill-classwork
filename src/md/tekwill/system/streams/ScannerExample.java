package md.tekwill.system.streams;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        System.out.println("our first line is: " + "this is my first line");

        String tryIt = "blah" + 1L;
        String tryItSecondTime = 1 + 121 + "String"; // evaluation starts from left to right: "(1 + 121)" + "String"
        String tryItThirdTime = "String" + 1 + 121; // evaluation starts from left to right: "String" + "1" + "121"
        System.out.println("tryItSecondTime is: " + tryItSecondTime);
        System.out.println("tryItThirdTime is: " + tryItThirdTime);

        int myNumber = scanner.nextInt();
        System.out.println("my number is: " + myNumber);

        float myFloatNumber = scanner.nextFloat();
        System.out.println("my float number: " + myFloatNumber);
    }
}
