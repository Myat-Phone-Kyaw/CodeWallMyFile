package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson10Sorted {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 1, 32, 53, 26, 1436, 1234, 21, 436, 7);
        integers.stream().filter(integer -> integer < 300).sorted().forEach(System.out::println);
    }
}
