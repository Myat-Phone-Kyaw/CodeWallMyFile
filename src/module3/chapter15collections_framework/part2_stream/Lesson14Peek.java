package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lesson14Peek {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 1, 2, 3, 4, 3, 4, 5, 5, 6, 6, 7, 8, 7);

        Stream<Integer> integerStream = Stream.of(3, 4, 5, 6, 7);

        Stream.of("one", "two", "three", "four")
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.println("Filtered Value : " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("Mapped Value : " + s))
                .forEach(System.out::println);
    }
}
