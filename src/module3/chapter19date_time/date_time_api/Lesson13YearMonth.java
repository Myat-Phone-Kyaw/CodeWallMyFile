package module3.chapter19date_time.date_time_api;

import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Lesson13YearMonth {
    public static void main(String[] args) {
        /**
         * Example 1
         */


//        YearMonth ym = YearMonth.now();
//        System.out.println(ym);


        /**
         * Example 2
         */
//        YearMonth ym = YearMonth.now();
//        String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
//        System.out.println(s);


        /**
         *Example 3
         */


//        YearMonth y = YearMonth.now();
//        long l1 = y.get(ChronoField.YEAR);
//        System.out.println(l1);
//        long l2 = y.get(ChronoField.MONTH_OF_YEAR);
//        System.out.println(l2);


        /**
         * Example 4
         */


//        YearMonth ym1 = YearMonth.now();
//        YearMonth ym2 = ym1.plus(Period.ofYears(2));
//        System.out.println(ym2);


        /**
         * Example 5
         */

//        YearMonth ym1 = YearMonth.now();
//        YearMonth ym2 = ym1.minus(Period.ofYears(2));
//        System.out.println(ym2);


    }
}
