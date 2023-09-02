package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Lesson1Map {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 1, 32, 53, 26, 1436, 1234, 21, 436, 7);
//        Stream<Integer> integerStream = integers.stream();
//
//        Stream<Integer> integerStream1 = integerStream.map(integer -> integer + 10);
//        integerStream1.forEach(System.out::println);

        integers.stream().map(integer -> integer + 100).forEach(System.out::println);
    }
}
