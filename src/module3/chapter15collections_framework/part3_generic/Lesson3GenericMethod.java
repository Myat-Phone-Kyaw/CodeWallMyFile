package module3.chapter15collections_framework.part3_generic;

import java.util.*;

/*
* Type Parameters
* The type parameters naming conventions are important to learn generics thoroghly. The common type parameters are as follows.
*
* T - Type
* E - Element
* K - Key
* N - Number
* V - Value
*  */

public class Lesson3GenericMethod {
    static void show(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    static <T> void show1(T[] numbers) {
        for (T number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    static void show2(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    static void show3(List list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List inter = Arrays.asList(1, 2, 3, 4, "M");
        show3(inter);
    }
}
