package module3.chapter15collections_framework;

import java.util.*;
import java.util.function.Consumer;

public class Lesson9ForEachMethod {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3,1,32,53,26,1436,1234,21,436,7);

        /*for (Integer integer : integers) {
            System.out.println(integer);
        }*/

        /*for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }*/

//        integers.forEach(integer -> System.out.println(integer));

        /*integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });*/

        integers.forEach(System.out::println);


    }
}
