package module3.chapter16Serialization;

import com.google.gson.Gson;

import java.io.Reader;
import java.util.List;

public class Lesson3JsonListToJavaObject {
    public static void main(String[] args) {
        String str = "[{\"name\":\"Myat Phone Kyaw\",\"age\":23},{\"name\":\"Maverick\",\"age\":20},{\"name\":\"Shila\",\"age\":23},{\"name\":\"Linda\",\"age\":23}]";

        Gson gson = new Gson();

        List personList = gson.fromJson(str, List.class);

//        Person person1 = gson.fromJson(personList.stream().toList(), List.class);
        System.out.println(personList);
    }
}
