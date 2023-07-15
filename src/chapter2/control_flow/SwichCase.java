package chapter2.control_flow;

public class SwichCase {
    public static void main(String[] args) {
        int num = 7;
        switch (num) {
            case 1:
                System.out.println("This is 1.");
                break;
            case 2:
                System.out.println("This is 2.");
                break;
            case 3:
                System.out.println("This is 3.");
                break;
            case 4:
                System.out.println("This is 4.");
                break;
            case 5:
                System.out.println("This is 5.");
                break;
            default:
                System.out.println("Your number is " + num);
        }
    }
}
