package module3.chapter15collections_framework.part3_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson5LowerBoundWildCards {
    static void show(List<? super Toyota> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
    }

    public static void addNumbers(List<? super Integer> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        System.out.print("Displaying the integer values ");
        addNumbers(l1);
        System.out.println();

        List<Number> l2 = Arrays.asList(1.0, 2.0, 3.0);
        System.out.print("Displaying the number values ");
        addNumbers(l2);
        System.out.println();

        addNumbers(l1);
        addNumbers(l2);
    }
}
