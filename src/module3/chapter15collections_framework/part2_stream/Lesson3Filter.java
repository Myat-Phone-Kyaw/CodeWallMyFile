package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lesson3Filter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Myat Phone Kyaw", "aung aung", "koko", "mgmg", "shila", "maverick");

        list.stream().filter(s -> s.length()>4 && s.length()<11).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
