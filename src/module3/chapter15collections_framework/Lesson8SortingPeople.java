package module3.chapter15collections_framework;

import java.util.*;
import java.util.Collections;

public class Lesson8SortingPeople {
    public static void main(String[] args) {
        Person person = new Person("Myat Phone Kyaw", 100);
        Person person1 = new Person("Codewall", 42);
        Person person2 = new Person("Technologies", 54);
        Person person3 = new Person("CT", 12);
        Person person4 = new Person("Code", 53);
        Person person5 = new Person("Aroma", 54);
        Person person6 = new Person("ZZZ", 15);
        Person person7 = new Person("Holly", 26);

        List<Person> personList = Arrays.asList(person, person1, person2, person3, person4, person5, person6, person7);

        personList.sort((o1, o2) -> {
            if (o1.points < o2.points) {
                return 1;
            } else if (o1.points == o2.points) {
                return o1.name.compareTo(o2.name);
            } else {
                return -1;
            }
        });

        Collections.sort(personList, (o1, o2) -> {
            if (o1.points == o2.points) {
                if (o1.name.compareToIgnoreCase(o2.name) < o2.name.compareToIgnoreCase(o1.name)) return -1;
            }
            return 1;
        });

        personList.forEach(person8 -> {
            System.out.println(person8.points + " " + person8.name);
        });
    }
}

class Person {
    String name;
    int points;

    public Person(String name, int points) {
        this.name = name;
        this.points = points;
    }
}
