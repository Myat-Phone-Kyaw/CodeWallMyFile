package module3.chapter19date_time.date_time_api;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Lesson16Instant {
    public static void main(String[] args) {
        /**
         * Example 1
         */


//        Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");
//        System.out.println(inst);


        /**
         * Example 2
         */


//        Instant instant = Instant.now();
//        System.out.println(instant);


        /**
         * Example 3
         */

//        Instant instant = Instant.parse("2017-02-03T11:25:30.00Z");
//        instant = instant.minus(Duration.ofDays(125));
//        System.out.println(instant);


        /**
         * Example 4
         */


//        Instant inst1 = Instant.parse("2017-02-03T11:25:30.00Z");
//        Instant inst2 = inst1.plus(Duration.ofDays(125));
//        System.out.println(inst2);


        /**
         * Example 5
         */

//        Instant inst = Instant.parse("2017-02-03T11:35:30.00Z");
//        System.out.println(inst.isSupported(ChronoUnit.DAYS));
//        System.out.println(inst.isSupported(ChronoUnit.YEARS));
    }
}
