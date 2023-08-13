package module2.chapter12exception_handling.type_of_exceptions;

import java.util.Scanner;

public class InputMismatchExceptionEx {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        int userInput = new Scanner(System.in).nextInt();
        System.out.println(userInput);
    }
}
