package module2.chapter5inheritance;

public class Lesson2MultiLevelInheritance {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        Parent1 obj1 = new Parent1();

        System.out.println(obj.a);
        System.out.println(obj1.b);
    }
}

class GrandParents {
    int a = 2;
}

class Parent1 extends GrandParents {
int b = 4;
}

class Child1 extends Parent1{
int c = 6;
}

