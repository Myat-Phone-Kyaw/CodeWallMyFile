package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson4Filter {
    public static void main(String[] args) {
        Person person = new Person("Myat Phone Kyaw", 100);
        Person person1 = new Person("Codewall", 34);
        Person person2 = new Person("Technologies", 53);
        Person person3 = new Person("Technologies", 53);
        Person person4 = new Person("Maverick", 21);
        Person person5 = new Person("Shila", 24);
        Person person6 = new Person("Lou Shi", 32);
        Person person7 = new Person("John", 19);

        List<Person> personList = Arrays.asList(person, person1, person2, person3, person4, person5, person6, person7);

        personList.stream().filter(person8 -> person8.age > 23).sorted((o1, o2) -> o1.name.compareTo(o2.name)).map(person8 -> person8.name.toUpperCase()).forEach(System.out::println);
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}