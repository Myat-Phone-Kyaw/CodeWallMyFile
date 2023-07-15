package module2.chapter4.oop_basics;

public class Lesson6Method {
    void show() {
        System.out.println("This is show method.");
    }

    static void display() {
        System.out.println("This is display method.");
    }

    public static void main(String[] args) {
        Lesson6Method showing = new Lesson6Method();
        showing.show();
        display();
    }
}
