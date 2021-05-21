package md.tekwill.classwork.dates.localdatetimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime parsedDateTime = LocalDateTime.parse("2021-05-12T14:30");
        System.out.println(parsedDateTime);

        // Be careful not the forget the separator 'T'
//        LocalDateTime dontForgetTheSeparator = LocalDateTime.parse("2021-05-1214:30");
//        System.out.println(dontForgetTheSeparator);

        LocalDate ofLocalDate = LocalDate.of(2021, Month.MAY, 12);
        LocalTime ofLocalTime = LocalTime.of(14, 30);

        LocalDateTime ofDateTime = LocalDateTime.of(ofLocalDate, ofLocalTime);
        System.out.println(ofDateTime);

        LocalDateTime ofDateTimeDifferent = LocalDateTime.of(2021, Month.MAY, 12, 14, 30, 33);
        System.out.println(ofDateTimeDifferent);

    }
}
