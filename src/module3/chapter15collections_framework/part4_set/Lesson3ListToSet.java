package module3.chapter15collections_framework.part4_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Lesson3ListToSet {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(211);
        integers.add(21);
        integers.add(21);



        System.out.println(integers);

        Set<Integer> hashSet = new HashSet<>(integers);
        System.out.println(hashSet);


    }
}
