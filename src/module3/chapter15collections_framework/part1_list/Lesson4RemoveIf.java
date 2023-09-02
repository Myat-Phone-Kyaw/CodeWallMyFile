package module3.chapter15collections_framework.part1_list;

import java.util.*;
import java.util.function.Predicate;

public class Lesson4RemoveIf {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        System.out.println(integers);

        integers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0) return true;
                return false;
            }
        });

        integers.removeIf(integer -> {
            if (integer % 2 == 0) return true;
            return false;
        });

        integers.removeIf(integer -> integer % 2 == 0);
        System.out.println(integers);

        List<String> names = new ArrayList<>();
        names.add("Mg A");
        names.add("Ma C");
        names.add("Mg T");
        names.add("Mg E");
        names.add("Ma U");
        names.add("Ma O");
        names.add("Mg Q");
        names.add("Ma A");
        System.out.println(names);

//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String name) {
//                if(name.contains("Mg")) return true;
//                return false;
//            }
//        });

        names.removeIf(name -> name.contains("Mg"));
        names.removeIf(name -> name.endsWith("A"));

        System.out.println(names);


    }
}
