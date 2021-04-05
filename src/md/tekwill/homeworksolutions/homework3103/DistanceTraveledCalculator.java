package md.tekwill.homeworksolutions.homework3103;

import java.util.Scanner;

public class DistanceTraveledCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the speed of a vehicle (in m/h): ");
        int speedOfVehicle = in.nextInt();
        System.out.println("Please input the number of hours it traveled: ");
        int numberOfHours = in.nextInt();

        System.out.println("Hour\tDistance Traveled");
        System.out.println("-----------------------");
        for (int i = 1; i <= numberOfHours; i++) {
            int distance = speedOfVehicle * i;
            System.out.println(i + "\t\t\t" + distance);
        }
    }
}
