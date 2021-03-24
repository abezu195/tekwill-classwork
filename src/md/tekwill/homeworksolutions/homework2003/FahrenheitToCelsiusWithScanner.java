package md.tekwill.homeworksolutions.homework2003;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FahrenheitToCelsiusWithScanner {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce temperature in fahrenheit: ");
            float fahrenheitTemperature = scanner.nextFloat();
            float celsius = (fahrenheitTemperature - 32.0F) * (5.0F/9.0F);
            System.out.println("Temperature " + fahrenheitTemperature + " \u00B0F is " + celsius + " in \u00B0C");
        } catch (InputMismatchException ex) {
            System.err.println("The input number has a wrong format! It must be a number, not String or character!");
        }
    }
}
