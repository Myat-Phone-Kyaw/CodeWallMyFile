package module2.chapter12exception_handling;

public class Lesson8Throw {
    static void makeException(int a){
        if(a < 18){
            throw new ArithmeticException();
        }else {
            System.out.println("You're eligible to vote.");
        }

    }
    public static void main(String[] args) {
        makeException(17);
    }
}
