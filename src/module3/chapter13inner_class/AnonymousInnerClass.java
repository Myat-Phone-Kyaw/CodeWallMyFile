package module3.chapter13inner_class;

interface ABC{
    void display();
}

abstract class A{
    abstract void show();
}

class B extends A{
    @Override
    void show(){

    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new A() {
            @Override
            void show() {

            }
        };

        new ABC() {
            @Override
            public void display() {

            }
        };

        new B();
    }
}
