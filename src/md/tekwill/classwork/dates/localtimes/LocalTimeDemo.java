package md.tekwill.classwork.dates.localtimes;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime endOfDay = LocalTime.of(23, 59);
        System.out.println("End of the day is " + endOfDay);

        LocalTime startOfDay = LocalTime.of(0, 0, 1);
        System.out.println("Start of the day is " + startOfDay);

        LocalTime somewhereInBetweenTheDay = LocalTime.of(12, 13, 45, 34567890);
        System.out.println("A random time during the day is " + somewhereInBetweenTheDay);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is " + currentTime); // 20:32-33

        LocalTime parsedTime = LocalTime.parse("10:15:30"); // "hh:mm:ss"
        System.out.println("Parsed time " + parsedTime);
    }
}
