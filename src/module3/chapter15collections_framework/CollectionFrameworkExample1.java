package module3.chapter15collections_framework;

import java.util.*;

public class CollectionFrameworkExample1 {
    public static void main(String[] args) {
        int numbers[] = new int[6];
        numbers[0] = 1;
        int number2[] = {1, 2, 4, 5, 6};
        number2[2] = 3;
        System.out.println(Arrays.toString(number2));
        Object object[] = {1, "MPK", true};

        List list = new ArrayList();
        list.add(1);
        list.add("MPK");
        list.add(true);
        list.add(4);
        list.add('a');
        System.out.println(list);

        List<Object> list1 = new ArrayList<>();

        List list2 = Arrays.asList(2,4,6,8,10);
        List<Integer> list3 = new ArrayList<>(); // generate dataType <>
        list3.add(1);
        list3.add(3);
        list3.add(5);
//        list3.add("mPk");
//        list3.add(true);
        System.out.println(list3);
        System.out.println(list.get(1));

        // Type Casting
        String str = Integer.toString(list3.get(0));
        System.out.println(str);
    }
}
