package module3.chapter19date_time.date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lesson2LocalDateClass {
    public static void main(String[] args) {

        /**
         * Example 1
         */
//        LocalDate date = LocalDate.now();
//        LocalDate yesterday = date.minusDays(1);
//        LocalDate tomorrow = yesterday.plusDays(2);
//        LocalDate last7Day = yesterday.plusDays(7);
//        System.out.println("Today date: "+date);
//        System.out.println("Yesterday date: "+yesterday);
//        System.out.println("Tomorrow date: "+tomorrow);
//        System.out.println("7 days later: "+last7Day);

        /**
         * Example 2
         * Program to demonstrate isLeapYear() method of LocalDate Class.
         */


//        LocalDate date1 = LocalDate.of(1999, 12, 10);
//        System.out.println(date1.isLeapYear());
//        LocalDate date2 = LocalDate.of(2020, 12, 23);
//        System.out.println(date2.isLeapYear());

        /**
         * Example 3
         * Program to demonstrate atTime() method of LocalDate class.
         */

//        LocalDate date = LocalDate.of(2017, 1, 13);
//        LocalDateTime datetime = date.atTime(2,50,9);
//        System.out.println(datetime);


        /**
         * Example4
         */

        // Converting LocalDate to String

//        LocalDate d1 = LocalDate.now();
//        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);
//        System.out.println("Date1 in string :  " + d1Str);
//
//        LocalDate d2 = LocalDate.of(2002, 05, 01);
//        String d2Str = d2.format(DateTimeFormatter.ISO_DATE);
//        System.out.println("Date2 in string :  " + d2Str);


        /**
         * Example 5
         */


//        String dInStr = "2011-09-01";
//        LocalDate d1 = LocalDate.parse(dInStr);
//        System.out.println("String to LocalDate : " + d1);

    }
}
