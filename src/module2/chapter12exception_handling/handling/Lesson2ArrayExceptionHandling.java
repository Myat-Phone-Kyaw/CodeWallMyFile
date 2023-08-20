package module2.chapter12exception_handling.handling;

import java.util.Arrays;

public class Lesson2ArrayExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Before");

        int arr[] = {1, 2, 3, 4, 5};

        try {
            arr[9] = 25;
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("After");
    }
}
