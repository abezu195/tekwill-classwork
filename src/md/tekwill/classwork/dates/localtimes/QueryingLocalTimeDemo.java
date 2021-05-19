package md.tekwill.classwork.dates.localtimes;

import java.time.LocalTime;

public class QueryingLocalTimeDemo {
    public static void main(String[] args) {
        LocalTime timeInFuture = LocalTime.of(14, 55, 23, 5981241);
        System.out.println("Hour " + timeInFuture.getHour());
        System.out.println("Minute " + timeInFuture.getMinute());
        System.out.println("Second " + timeInFuture.getSecond());
        System.out.println("Nano " + timeInFuture.getNano());

        LocalTime timeInPast = timeInFuture.minusHours(1);
        System.out.println("Is time in future before time in past? " + timeInFuture.isBefore(timeInPast)); //false
        System.out.println("Is time in future after time in past? " + timeInFuture.isAfter(timeInPast)); //true
    }
}
