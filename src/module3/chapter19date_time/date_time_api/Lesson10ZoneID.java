package module3.chapter19date_time.date_time_api;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class Lesson10ZoneID {
    public static void main(String[] args) {


        /**
         * Example 1
         */
//        ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");
//        ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");
//        LocalTime id1 = LocalTime.now(zoneid1);
//        LocalTime id2 = LocalTime.now(zoneid2);
//        System.out.println(id1);
//        System.out.println(id2);
//        System.out.println(id1.isBefore(id2));
//        System.out.println(id1.isAfter(id2));


        /**
         * Example 2
         */


//        ZoneId zone = ZoneId.systemDefault();
//        System.out.println(zone);


        /**
         * Example 3
         */


//        ZoneId z = ZoneId.systemDefault();
//        String s = z.getId();
//        System.out.println(s);


        /**
         * Example 4
         */


//        ZoneId z = ZoneId.systemDefault();
//        System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));
    }
}
