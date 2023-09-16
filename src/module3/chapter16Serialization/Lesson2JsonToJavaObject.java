package module3.chapter16Serialization;

import com.google.gson.Gson;

import java.util.List;

public class Lesson2JsonToJavaObject {
    public static void main(String[] args) {
        String str = "{\"name\":\"Myat Phone Kyaw\",\"age\":23}";

        Person person = new Gson().fromJson(str, Person.class);

        System.out.println(person.name);
    }
}
