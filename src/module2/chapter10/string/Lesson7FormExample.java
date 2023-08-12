package module2.chapter10;

import java.util.Scanner;

public class Lesson7FormExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String gender = "";

        while (true){
            System.out.print("Enter your name: ");
            String userInput = new Scanner(System.in).nextLine();


            if(userInput.startsWith("Mg")||userInput.startsWith("U")){

                gender = "male";
                break;
            } else if (userInput.startsWith("Ma")||userInput.startsWith("Daw")) {
                gender = "female";
                break;
            }

        }


        System.out.print("Enter your email: ");


        while (true){
            String userInput2 = scanner.nextLine();

            if(userInput2.endsWith("@gmail.com")){
                System.out.println("Your email format is correct and your gender is "+gender);
                break;
            }else {
                System.out.println("Your email format is not correct");
                System.out.println("Please enter your email again");
            }
        }



    }
}
