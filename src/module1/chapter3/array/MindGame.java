package module1.chapter3.array;

import java.util.Random;
import java.util.Scanner;

public class MindGame {
    public static void main(String[] args) {
        // Random Number
        Random num = new Random();
        int random = num.nextInt(99) + 1;
//        System.out.println(random);

        //Guess the number
        System.out.println("< Mind Game >" + "\n");
        System.out.print("Guess the number between 1 and 99: ");
        Scanner scn = new Scanner(System.in);
        int count = 0;
        while (true) {
            int input = scn.nextInt();
            count++;
            if (input == random) {
                System.out.println("You are right in the " + count + "th time.");
                if (count <= 4) {
                    System.out.println("Genius!");
                } else if (count <= 8) {
                    System.out.println("Not bad.");
                } else if (count > 8) {
                    System.out.println("Stupid");
                }
                break;
            } else {
                if (input < random) {
                    System.out.println("The number is greater than " + input + ".");
                    System.out.print("Guess the number again: ");
                } else if (input > random) {
                    System.out.println("The number is less than " + input + ".");
                    System.out.print("Guess the number again: ");
                }
            }
        }

    }
}
