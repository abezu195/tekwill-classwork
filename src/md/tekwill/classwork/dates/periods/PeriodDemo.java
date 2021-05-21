package md.tekwill.classwork.dates.periods;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        Period oneDayPeriod = Period.of(0, 0, 1);
        System.out.println(oneDayPeriod);
        oneDayPeriod = Period.ofDays(1);
        System.out.println(oneDayPeriod);
        oneDayPeriod = Period.parse("P1D");
        System.out.println(oneDayPeriod);

        Period minus1YearMinus1Month = Period.of(-1, -1, 0);
        System.out.println(minus1YearMinus1Month);
        minus1YearMinus1Month = Period.parse("-P1Y1M10D"); // it is the same as the next statement
        System.out.println(minus1YearMinus1Month);
        minus1YearMinus1Month = Period.parse("P-1y-1m-10d"); // it is the same as the previous statement
        System.out.println(minus1YearMinus1Month);

        LocalDate now = LocalDate.now();
        Period oneYearTwentyDays = Period.of(1, 0, 20);
        System.out.println(now.minus(oneYearTwentyDays));
        System.out.println(now.plus(oneYearTwentyDays));

        Period oneYearTwoMonths30Days = Period.of(1, 2, 30);
        Period.of(0, 0, oneYearTwoMonths30Days.getDays()).plusDays(365).plusDays(60);
        System.out.println(oneYearTwoMonths30Days.toTotalMonths());

    }
}
