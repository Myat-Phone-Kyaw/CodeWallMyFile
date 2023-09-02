package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Lesson5Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
        int result = list.stream().reduce(0, Integer::sum);
        System.out.println(result);

        Optional<Integer> integerOptional = list.stream().reduce(Integer::sum);
        int result1 = integerOptional.get();
        System.out.println(result1);

//        list.stream().reduce(new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer + integer2;
//            }
//        });

        System.out.println(list.stream().reduce(Integer::sum).get());
    }
}
