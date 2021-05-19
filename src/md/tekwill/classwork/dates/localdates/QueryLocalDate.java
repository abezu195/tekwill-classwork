package md.tekwill.classwork.dates.localdates;

import java.time.LocalDate;

public class QueryLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2021-05-19");
        // comments are true for 2021-05-19
        System.out.println(date.getDayOfMonth()); //19
        System.out.println(date.getDayOfWeek()); // WEDNESDAY
        System.out.println(date.getDayOfWeek().getValue()); // 3
        System.out.println(date.getDayOfYear()); // 139
        System.out.println(date.getYear()); // 2021
        System.out.println(date.getMonth()); // MAY
        System.out.println(date.getMonthValue()); // 5

        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Is yesterday before tomorrow : " + yesterday.isBefore(tomorrow));
        System.out.println("Is yesterday after tomorrow : " + yesterday.isAfter(tomorrow));
    }
}
