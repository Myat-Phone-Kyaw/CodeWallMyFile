package module2.chapter12exception_handling;

import java.util.InputMismatchException;

public class Lesson5MultipleCatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.println("Before");

        try {
            int result = a/b;
            System.out.println(result);
        }catch (InputMismatchException e) {
            System.out.println(e);
        }catch (NullPointerException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println("General Exception");
        }

        System.out.println("After");
    }
}
