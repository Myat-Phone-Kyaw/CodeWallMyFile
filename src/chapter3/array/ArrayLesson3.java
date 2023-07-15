package chapter3.array;

import java.util.Arrays;

public class ArrayLesson3 {
    public static void main(String[] args) {
        int a = 3;
        int numbers[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {10, 9, 8},
        };

        // yoe" from 2nd row
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }

        // plus 10
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j]+10 + " ");
            }
        }
    }
}
