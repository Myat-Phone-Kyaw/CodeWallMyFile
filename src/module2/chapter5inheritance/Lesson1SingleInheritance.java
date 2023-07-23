package module2.chapter5inheritance;

public class Lesson1SingleInheritance {
     /* Single Inheritance
     Multi Level Inheritance
     Hierarchical Inheritance
     Multiple Inheritance
     Hybrid Inheritance */

    public static void main(String[] args) {
        System.out.println(new Parent().a + new Child().b);
        System.out.println(new Child().a + new Child().b);
    }
}

class Parent {
    int a = 12;
}

class Child extends Parent{
    int b = 14;
}
