package md.tekwill.classwork.dates.patterns;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Scanner;

public class PatternsDemo {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateFormatter.format(dateNow));

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeFormatter.format(timeNow));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("'It is 'dd/MMM/yyyy ' with time ' HH:mm");
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(dateTimeNow));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me your desired date and time: ");
        String dateTime = scanner.nextLine();
        DateTimeFormatter readDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTime, readDateTimeFormatter);
        System.out.println(dateTimeFormatter.format(parsedDateTime));

        System.out.println(timeFormatter.format(dateNow));
    }
}
