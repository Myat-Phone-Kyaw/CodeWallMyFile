package module3.chapter19date_time.date_time_api;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Lesson3LocalTime {
    public static void main(String[] args) {

        /**
         * Example 1
         */
//        LocalTime time = LocalTime.now();
//        System.out.println(time);


        /**
         * Example 2
         */

//        LocalTime time = LocalTime.of(10,43,12);
//        System.out.println(time);


        /**
         * Example 3
         * Java LocalTime Example: minusHours() and minusMinutes()
         */

//        LocalTime time1 = LocalTime.of(10,43,12);
//        System.out.println(time1);
//        LocalTime time2=time1.minusHours(2);
//        LocalTime time3=time2.minusMinutes(34);
//        System.out.println(time3);


        /**
         * Example 4
         *Java LocalTime Example: plusHours() and plusMinutes()
         */

//        LocalTime time1 = LocalTime.of(10,43,12);
//        System.out.println(time1);
//        LocalTime time2=time1.plusHours(4);
//        LocalTime time3=time2.plusMinutes(18);
//        System.out.println(time3);


        /**
         * Example 5
         *
         */

        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("India Time Zone: "+time1);

        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Japan Time Zone: "+time2);

        long hours = ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Hours between two Time Zone: "+hours);

        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println("Minutes between two time zone: "+minutes);
    }
}
