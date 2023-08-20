package module3.chapter13inner_class;

public class Lesson1MemberInnerClass {
    private int a = 20;

    class In{
        void show(){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Lesson1MemberInnerClass obj = new Lesson1MemberInnerClass();
        In obj1 = obj.new In();
        obj1.show();
    }
}
