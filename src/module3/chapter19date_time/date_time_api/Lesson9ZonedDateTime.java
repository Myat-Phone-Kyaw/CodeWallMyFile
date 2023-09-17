package module3.chapter19date_time.date_time_api;

import java.time.*;

public class Lesson9ZonedDateTime {
    public static void main(String[] args) {


        /**
         * Example 1
         */
//        ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");
//        System.out.println(zone);


        /**
         * Example 2
         */

//        LocalDateTime ldt = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);
//        ZoneId india = ZoneId.of("Asia/Kolkata");
//        ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);
//        System.out.println("In India Central Time Zone: " + zone1);
//        ZoneId  tokyo = ZoneId.of("Asia/Tokyo");
//        ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);
//        System.out.println("In Tokyo Central Time Zone:"  + zone2);


        /**
         * Example 3
         */

//        ZonedDateTime zone =ZonedDateTime.now();
//        System.out.println(zone.getZone());


        /**
         * Example 4
         */


//        ZonedDateTime zone= ZonedDateTime.now();
//        ZonedDateTime m = zone.minus(Period.ofDays(126));
//        System.out.println(m);

        /**
         * Example 5
         */


        ZonedDateTime zone= ZonedDateTime.now();
        ZonedDateTime p = zone.plus(Period.ofDays(126));
        System.out.println(p);
    }
}
