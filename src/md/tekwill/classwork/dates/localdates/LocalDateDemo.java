package md.tekwill.classwork.dates.localdates;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate fifthOfNovember = LocalDate.of(2050, 11, 5);
        System.out.println(fifthOfNovember);

        LocalDate fifthOfOctober = LocalDate.of(2051, Month.OCTOBER, 5);
        System.out.println(fifthOfOctober);

        LocalDate todaysDate = LocalDate.now();
        System.out.println("Today is: " + todaysDate);

        LocalDate twentyFifthOfJune = LocalDate.parse("2021-06-25");
        System.out.println("Parsed local date: " + twentyFifthOfJune);

        System.out.println(LocalDate.parse("2007-12-03"));


//        LocalDate throwsException = LocalDate.of(2050, 11, 32); throws exception because of invalid 32'nd day
//        LocalDate throwsException = LocalDate.of(2021, 2, 29); throws exception because of February 2021 has MAXIMUM 28 days
//        LocalDate throwsException = LocalDate.parse("2021/06/25"); throws exception because not expected format!

    }
}
