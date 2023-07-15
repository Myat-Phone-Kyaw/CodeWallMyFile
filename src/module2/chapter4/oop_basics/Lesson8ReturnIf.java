package module2.chapter4.oop_basics;

import java.util.Scanner;

public class Lesson8ReturnIf {
    static String result() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int input = scn.nextInt();

        if (input % 2 == 0) {
            return "This is even.";
        }
        return "This is odd.";
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}
