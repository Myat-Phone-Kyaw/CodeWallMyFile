package module2.chapter12exception_handling.handling;

import module2.chapter12exception_handling.type_of_exceptions.NumberFormatExceptionEx;

public class Lesson5NumberFormatHandling {
    public static void main(String[] args) {
        System.out.println("Before");
        String number = "abc";

        try {
            int num = Integer.parseInt(number);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }


        System.out.println("After");
    }
}
