package module3.chapter15collections_framework;

import java.util.*;

public class Lesson7Sorting {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(5);
        integers.add(4);
        integers.add(7);
        integers.add(8);
        integers.add(0);
        integers.add(2);
        integers.add(3);
        integers.add(5);

        System.out.println(integers);
//        integers.sort();
//        Collections.sort(integers);
//        System.out.println("Lower to Higher =>" + integers);
//
//        Collections.reverse(integers);
//        System.out.println("Higher to lower=> " + integers);

//        Collections.sort(integers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 > o2) return -1;
//                return 1;
//            }
//        });

//        Collections.sort(integers,(o1, o2) -> {
//            if(o1>o2) return 1;
//            return -1;
//        });

//        Collections.sort(integers, Comparator.reverseOrder());

        integers.sort(Comparator.naturalOrder());
        integers.sort(Comparator.reverseOrder());

        System.out.println(integers);
    }
}
