package module2.chapter10.string;

import java.util.Arrays;

public class Lesson6ContainsExample {
    public static void main(String[] args) {
        String foods[] = {"meat", "chicken", "steak", "ham", "roast-beef", "turkey", "pork chop", "ribs", "bacon", "sausage"};

        System.out.println(Arrays.toString(foods));

        for (String s : foods) {
            if(s.contains("a")){
                System.out.print(s+ "  ");
            }
        }
    }
}
