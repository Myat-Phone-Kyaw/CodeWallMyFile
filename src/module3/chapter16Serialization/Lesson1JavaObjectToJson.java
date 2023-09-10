package module3.chapter16Serialization;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class Lesson1JavaObjectToJson {
    public static void main(String[] args) {
        Person obj = new Person("Myat Phone Kyaw", 23);
        Person obj1 = new Person("Maverick", 20);
        Person obj2 = new Person("Shila", 23);
        Person obj3 = new Person("Linda", 23);

        List<Person> list = Arrays.asList(obj, obj1, obj2, obj3);

        Gson gson = new Gson();
        String str = gson.toJson(list);
        System.out.println(str);

    }
}
