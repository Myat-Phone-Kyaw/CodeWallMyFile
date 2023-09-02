package module3.chapter15collections_framework;

import java.util.*;

public class Lesson1ListIntro {
    public static void main(String[] args) {
        int numbers[] = new int[6];
        numbers[0] = 1;
        int number2[] = {1, 2, 4, 5, 6};
        number2[2] = 3;
        System.out.println(Arrays.toString(number2));
        Object object[] = {1, "MPK", true};

        List list = new ArrayList();
        list.add(1);
        list.add("Myat Phone Kyaw");
        list.add(true);

        System.out.println(list);

        Integer integer = (Integer) list.get(0);
        System.out.println(integer);

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);

        int num = list1.get(2);
        System.out.println(num);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
//        list2.add(4);     can't add like that
        list2.set(0, 20); // edit the array(list)
        System.out.println(list2);
    }
}
