package module3.chapter15collections_framework.part1_list;

import java.util.*;

public class Lesson5RetainAll {
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

        List<Integer> delList = Arrays.asList(1,3,5,7);
        integers.retainAll(delList);
        System.out.println(integers);
    }
}
