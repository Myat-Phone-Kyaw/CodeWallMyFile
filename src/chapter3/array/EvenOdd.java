package chapter3.array;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter an even integer: ");
        while (true){
            int input = scn.nextInt();
            //if you input odd number retype
            if (input % 2 == 0) {
                System.out.print("Even integer.");
                break;
            } else {
                System.out.print("Enter an even integer: ");
            }
        }
    }
}
