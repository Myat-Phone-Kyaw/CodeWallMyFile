package module1.chapter3.array;

import java.util.Arrays;

public class ArrayLesson4 {
    public static void main(String[] args) {
        /*1   2   3
        1   2   3   4
        7   8
        9   10  11  12  13*/

        int numbers[][] = new int[4][];
        numbers[0] = new int[3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;

        numbers[1] = new int[4];
        numbers[1][0] = 1;
        numbers[1][1] = 2;
        numbers[1][2] = 3;
        numbers[1][3] = 4;

        numbers[2] = new int[2];
        numbers[2][0] = 7;
        numbers[2][1] = 8;

        numbers[3] = new int[5];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 9; j < 14; j++) {
//                numbers[3][i] = i;
//            }
//        }
        numbers[3][0] = 9;
        numbers[3][1] = 10;
        numbers[3][2] = 11;
        numbers[3][3] = 12;
        numbers[3][4] = 13;

        for (int[] number : numbers) {
            System.out.println(Arrays.toString(number));
        }
    }
}
