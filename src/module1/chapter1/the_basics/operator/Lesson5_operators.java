package module1.chapter1.the_basics.operator;

public class Lesson5_operators {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);

        int b = 10;
        System.out.println(b--);
        System.out.println(--b);
        System.out.println(b);

        int c = 5;
        int d = 5;
        System.out.println(c + d++);
        // Unary Operator
    }
}
