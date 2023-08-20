package module2.chapter12exception_handling.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson3InputMismatchHandling {
    public static void main(String[] args) {
        System.out.println("Before");
        System.out.print("Enter your ID: ");

        try {
            int userInput = new Scanner(System.in).nextInt();

            System.out.println(userInput);
        }catch (InputMismatchException e) {
            System.out.println(e);
        }
        System.out.println("After");
    }
}
