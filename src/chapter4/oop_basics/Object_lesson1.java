package chapter4.oop_basics;

public class Object_lesson1 {
        int b = 5;
//    static int c = 10;

    public static void main(String[] args) {
        Object_lesson1 num = new Object_lesson1();
        System.out.println(num.b);
    }

}

class Inside{
    public static void main(String[] args) {
        Object_lesson1 num = new Object_lesson1();
        System.out.println(num.b);
    }
}