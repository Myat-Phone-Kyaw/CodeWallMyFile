package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson19NonMatch {
    public static void main(String[] args) {
//        List<Integer> integerList = Arrays.asList(3, 6, 7, 9, 12, 15);
        List<Integer> integers = Arrays.asList(3, 1, 32, 53, 26, 1436, 1234, 21, 436, 7);
        System.out.println(integers.stream().noneMatch(integer -> integer % 3 == 0));
    }
}
