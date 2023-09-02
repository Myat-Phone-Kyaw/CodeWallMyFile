package module3.chapter15collections_framework.part1_list;

import java.util.*;

public class Lesson3Remove {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(4);
        integerList.add(6);
        integerList.add(8);
        integerList.add(10);
        System.out.println(integerList);

        integerList.remove(1);
        System.out.println("Remove by indexr =>" + integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Myat");
        stringList.add("Phone");
        stringList.add("Kyaw");
        stringList.add("Maverick");
        stringList.add("Shila");

        System.out.println(stringList);
        stringList.remove(3);
        System.out.println("Remove by index =>" + stringList);

        stringList.remove("Shila");
        System.out.println("Remove by object =>" + stringList);

        List delList = Arrays.asList("Myat", "Kyaw");
        stringList.removeAll(delList);
        System.out.println("Remove by removeAll => " + stringList);

    }
}
