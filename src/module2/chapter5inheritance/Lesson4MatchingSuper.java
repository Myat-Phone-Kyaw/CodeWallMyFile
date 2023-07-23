package module2.chapter5inheritance;

public class Lesson4MatchingSuper {
    public static void main(String[] args) {
        Child4 obj = new Child4();
    }
}

class Parent3 {
    public Parent3() {
        System.out.println("Parent is working");
    }
}

class Child4 extends Parent3 {
    public Child4() {
        super();
        System.out.println("Child is working");
    }
}
