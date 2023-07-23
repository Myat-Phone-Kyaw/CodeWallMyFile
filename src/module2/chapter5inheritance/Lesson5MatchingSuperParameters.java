package module2.chapter5inheritance;

public class Lesson5MatchingSuperParameters {
    public static void main(String[] args) {
        Child5 obj = new Child5(3);
        Child5 obj1 = new Child5(4);
    }
}

class Parent4 {
    int a ;
    /*public Parent4() {
        System.out.println("Parent is working");
    }*/
    public Parent4(int a) {
        this.a = a;
        System.out.println(a);
    }
}

class Child5 extends Parent4 {
    public Child5(int a) {
        super(a);
    }
//        public Child5(int num) {
//            super(num);
//            System.out.println("Child is working");
//        }
}