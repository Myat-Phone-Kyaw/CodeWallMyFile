package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lesson6ReduceString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("f", "u", "c", "k", " ", "y", "o", "u");
        String str = stringList.stream().reduce("Hello World, ", (s, s2) -> s + s2);
        System.out.println(str);

        Optional<String> stringOptional = stringList.stream().reduce((s, s2) -> s + s2);
        String str1 = stringOptional.get();
        System.out.println(str1);

        System.out.println(stringList.stream().reduce((s, s2) -> s + s2).get());
    }
}
