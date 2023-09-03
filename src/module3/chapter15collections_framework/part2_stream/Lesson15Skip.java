package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lesson15Skip {
    public static void main(String[] args) {
        Stream.of(2,7,1,2,3,8,3,6,4,5,6,7,8)
                .filter(integer -> integer % 2 ==0)
                .skip(3)
                .forEach(System.out::println);

    }
}
