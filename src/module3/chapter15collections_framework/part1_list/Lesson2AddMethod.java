package module3.chapter15collections_framework.part1_list;

import java.util.*;

public class Lesson2AddMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("MPK");
        list.add(true);
        list.add('a');
        System.out.println(list);

        list.add(0, "Myat Phone Kyaw");
        System.out.println(list);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(4);
        integerList.add(6);
        System.out.println("Interger list => " + integerList);

        list.addAll(integerList);
        System.out.println("List is now => " + list);

        List<String> stringList = new ArrayList<>();
        stringList.add("Myat");
        stringList.add("Phone");
        stringList.add("Kyaw");
        System.out.println("String list => " + stringList);

        list.addAll(1, stringList);
        System.out.println("List is now => " + list);
    }
}
