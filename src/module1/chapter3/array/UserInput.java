package module1.chapter3.array;


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name = "Myat Phone Kyaw";
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scn.nextInt();
        System.out.println("Your Input integer is " + input);
    }
}
