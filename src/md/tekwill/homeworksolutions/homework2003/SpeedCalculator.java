package md.tekwill.homeworksolutions.homework2003;

public class SpeedCalculator {
    public static void main(String[] args) {
        int distanceInMeters = 2500;
        int hours = 5;
        int minutes = 56;
        int seconds = 23;
        // Formula: v = d/t
        System.out.println("Your speed in meters/second is " + (distanceInMeters / ((hours * 3600.0) + (minutes * 60) + seconds)));
        System.out.println("Your speed in km/h is " + ((distanceInMeters / 1000.0F) / ((hours + (minutes / 60.0F) + (seconds / 3600.0F)))));
        System.out.println("Your speed in m/h is " + ((distanceInMeters / 1609.0F) / ((hours + (minutes / 60.0F) + (seconds / 3600.0F)))));
    }
}
