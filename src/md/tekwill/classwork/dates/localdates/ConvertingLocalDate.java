package md.tekwill.classwork.dates.localdates;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConvertingLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 11, 5);
        System.out.println("Initial date " + date);

        LocalTime twelveOClock = LocalTime.of(12, 0);
        System.out.println("Date at twelve o clock is " + date.atTime(twelveOClock));
        System.out.println("Date at 1 o clock is " + date.atTime(13, 0));
        System.out.println("Date at 2 o clock is " + date.atTime(14, 45, 1));
        System.out.println("Date at 7 o clock is " + date.atTime(19, 55, 4, 50001));


//        System.out.println("Date at 25 o clock is " + date.atTime(25, 0)); throws exception!

        System.out.println(LocalTime.of(12, -0)); // -0 is allowed
//        System.out.println(LocalTime.of(-12, -0)); throws exception! -12 is not allowed, allowed values are 0 to 23
    }
}
