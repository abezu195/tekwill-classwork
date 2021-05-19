package md.tekwill.classwork.dates.localdates;

import java.time.LocalDate;

public class ManipulatingLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 9, 15);
        System.out.println("Initial date is " + date);

        System.out.println("Date minus 17 days " + date.minusDays(17));
        System.out.println("Date minus 5 months " + date.minusMonths(5));
        System.out.println("Date minus 5 weeks " + date.minusWeeks(5));
        System.out.println("Date minus 10 years " + date.minusYears(10));


        System.out.println("Proof that date is immutable: " + date);

        System.out.println("Date minus 2050 years " + date.minusYears(2050)); //-0029-09-15 stores negative value

//        System.out.println("Date minus 2050 years " + date.minusYears(1500000000)); throws exception, accepted values are between  valid values -999_999_999 - 999_999_999


        System.out.println("Change date to first day of month " + date.withDayOfMonth(1));
        System.out.println("Change date to 128th day of year " + date.withDayOfYear(128));
        System.out.println("Change date to 6th month " + date.withMonth(6));
        System.out.println("Change date 4042 year " + date.withYear(4042));

        System.out.println("Some random date: " + date.withYear(2035).withDayOfMonth(25).withMonth(11)); //? 2035-11-25

        System.out.println("Proof that date is immutable: " + date);

    }
}
