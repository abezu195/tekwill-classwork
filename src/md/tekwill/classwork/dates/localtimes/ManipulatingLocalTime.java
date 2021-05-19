package md.tekwill.classwork.dates.localtimes;

import java.time.LocalTime;

public class ManipulatingLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(22, 10); // 23
        System.out.println("Initial time is " + time);

        System.out.println("Time after 6 hours " + time.plusHours(6)); // 04:10
        System.out.println("Time after -25 minutes (NEGATIVE ADDITION ;) ) " + time.plusMinutes(-25)); // <=> time.minusMinutes(25); outputs 21:45
        System.out.println("Time before -25 minutes (NEGATIVE SUBTRACTION ;) ) " + time.minusMinutes(-25)); // <=> time.plusMinutes(25); outputs 22:35
        System.out.println("Time after 99 seconds " + time.plusSeconds(99)); // 22:11:39
        System.out.println("Time after some nanos " + time.plusNanos(9999999)); // 22:10:00.009999999


        System.out.println("Time shifted to 8 o'clock " + time.withHour(8));
    }
}
