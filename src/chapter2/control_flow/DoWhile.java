package chapter2.control_flow;

public class DoWhile {
    public static void main(String[] args) {
        int num = 100;
        do {
            System.out.println("Your Number is " + num);
            num /= 2;
        } while (num > 0);
    }
}
