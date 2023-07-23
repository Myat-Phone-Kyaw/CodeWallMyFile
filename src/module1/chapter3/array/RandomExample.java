package module1.chapter3.array;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random num = new Random();
        int random = num.nextInt(99)+1;
        System.out.println(random);
    }
}
