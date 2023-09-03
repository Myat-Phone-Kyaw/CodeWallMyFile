package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson12FindFirst {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 1, 2, 3, 4, 3, 4, 5, 5, 6, 6, 7, 8, 7);
        System.out.println(integerList.stream().filter(integer -> integer % 3 == 0).findFirst().get());

//        System.out.println(integerList.get(0));
    }
}
