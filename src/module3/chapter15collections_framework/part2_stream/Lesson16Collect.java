package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson16Collect {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 7, 1, 2, 3, 8, 3, 6, 4, 5, 6, 7, 8);
        List<Integer> filterList = integerList.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println("Collect : " + filterList);

        List<Integer> filterList1 = integerList.stream().filter(integer -> integer % 2 == 0).toList();
        System.out.println("ToList : " + filterList1);
    }
}
