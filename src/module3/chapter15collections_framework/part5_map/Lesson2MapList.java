package module3.chapter15collections_framework.part5_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson2MapList {
    public static void main(String[] args) {
        List<Map<String ,Object>> list = new ArrayList<>();

        Map<String ,Object > map = new HashMap<>();
        map.put("id",1);
        map.put("name","Thura Linn");
        map.put("age",23);

        Map<String ,Object > map1 = new HashMap<>();
        map.put("id",2);
        map.put("name","CodeWall");
        map.put("age",4);

        list.add(map);
        list.add(map1);


        List<Person> people = new ArrayList<>();


        Person person =new Person();
        person.setId(1);
        person.setName("Aung Aung");
        person.setAge(10);


        Person person2 =new Person();
        person.setId(2);
        person.setName("Aye Aye");
        person.setAge(11);

        people.add(person);
        people.add(person2);
    }
}

class Person{
    int id;
    String name;
    int age;

//    public Person(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }

    void setId(int id){
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
