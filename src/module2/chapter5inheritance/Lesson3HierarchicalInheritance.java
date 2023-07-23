package module2.chapter5inheritance;

public class Lesson3HierarchicalInheritance {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        Child3 obj1 = new Child3();

        System.out.println(obj.a);
        System.out.println(obj1.c);
        System.out.println(obj.b);
        System.out.println(obj1.a);
    }
}

class Parent2 {
    int a = 3;
}

class Child2 extends Parent2{
    int b = 6;
}

class Child3 extends  Parent2{
    int c = 9;
}
