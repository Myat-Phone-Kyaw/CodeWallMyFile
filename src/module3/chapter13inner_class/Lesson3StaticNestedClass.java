package module3.chapter13inner_class;

public class Lesson3StaticNestedClass {
    static class Inner{
        static void show(){
            System.out.println("ABC");
        }

    }

    public static void main(String[] args) {
        Inner.show();
    }
}
