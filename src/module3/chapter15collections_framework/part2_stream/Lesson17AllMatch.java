package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson17AllMatch {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 6, 7, 9, 12, 15);
        System.out.println(integerList.stream().allMatch(integer -> integer % 3 == 0));
    }
}
