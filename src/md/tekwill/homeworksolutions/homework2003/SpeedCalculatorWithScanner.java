package md.tekwill.homeworksolutions.homework2003;

import java.util.Scanner;

public class SpeedCalculatorWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce distance in meters: ");
        int distanceInMeters = scanner.nextInt(); // 2500
        System.out.print("\nIntroduce number of hours: ");
        int hours = scanner.nextInt(); // 5
        System.out.print("\nIntroduce number of minutes: ");
        int minutes = scanner.nextInt(); // 56
        System.out.print("\nIntroduce number of seconds: ");
        int seconds = scanner.nextInt(); //23
        // Formula: v = d/t
        System.out.println("Your speed in meters/second is " + (distanceInMeters / ((hours * 3600.0) + (minutes * 60) + seconds)));
        System.out.println("Your speed in km/h is " + ((distanceInMeters / 1000.0F) / ((hours + (minutes / 60.0F) + (seconds / 3600.0F)))));
        System.out.println("Your speed in m/h is " + ((distanceInMeters / 1609.0F) / ((hours + (minutes / 60.0F) + (seconds / 3600.0F)))));
    }
}
