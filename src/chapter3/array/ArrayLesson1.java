package chapter3.array;

import java.util.Arrays;

public class ArrayLesson1 {
    public static void main(String[] args) {
        int a = 3;
        int numbers[] = {1, 2, 3, 4, 5, 10};
        String cars[] = new String[5];

        /*System.out.println("Original: " + numbers[3]);
        numbers[3] = 7;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("New array: " + numbers[i]);
        }
        System.out.println(numbers.length); // length is property.

        System.out.println(Arrays.toString(numbers));*/

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = numbers.length - 2; i >= 0; i--) {
            System.out.print(numbers[i] + "\t");
        }*/

        /*for (int number : numbers) {
            System.out.println(number);
        }*/

        System.out.println(Arrays.toString(cars));
    }
}
