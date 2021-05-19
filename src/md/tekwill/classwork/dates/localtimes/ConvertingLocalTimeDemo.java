package md.tekwill.classwork.dates.localtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConvertingLocalTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 7, 21);
        LocalTime time = LocalTime.of(22, 10);
        LocalDateTime localDateTime = time.atDate(date);
        System.out.println("Date is " + date);
        System.out.println("Time is " + time);
        System.out.println("Time and date are " + localDateTime);
    }
}
