package module3.chapter19date_time.date_time_api;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class Lesson11ZoneOffset {
    public static void main(String[] args) {


        /**
         *Example 1
         */

//        ZoneOffset zone = ZoneOffset.UTC;
//        Temporal temp = zone.adjustInto(ZonedDateTime.now());
//        System.out.println(temp);


        /**
         * Example 2
         */


//        ZoneOffset zone = ZoneOffset.ofHours(5);
//        System.out.println(zone);


        /**
         * Example 3
         */


//        ZoneOffset zone = ZoneOffset.ofHoursMinutes(5,30);
//        System.out.println(zone);


        /**
         * Example 4
         */

//        ZoneOffset zone = ZoneOffset.UTC;
//        boolean b1 = zone.isSupported(ChronoField.OFFSET_SECONDS);
//        System.out.println(b1);
//        boolean b2 = zone.isSupported(ChronoField.SECOND_OF_MINUTE);
//        System.out.println(b2);
    }
}
