package module3.chapter15collections_framework.part4_set;

import java.util.HashSet;

public class Lesson2HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();

        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Five");
        hashSet.add("Four");
        hashSet.add("Two");
        hashSet.add("Five");
        hashSet.add("One");
        System.out.println(hashSet);


        HashSet<Integer> integers  = new HashSet<>();
        integers.add(6);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(1);
        integers.add(2);
        integers.add(4);

        System.out.println(integers);
    }
}
