package module2.chapter12exception_handling.type_of_exceptions;

import java.util.Arrays;

public class ArrayIndexOutOfBoundExceptionEx {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        arr[9] = 25;

        System.out.println(Arrays.toString(arr));
        System.out.println("This is the end.");
    }
}
