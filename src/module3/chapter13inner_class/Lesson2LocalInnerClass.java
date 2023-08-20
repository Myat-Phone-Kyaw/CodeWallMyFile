package module3.chapter13inner_class;

import java.lang.reflect.Method;

public class Lesson2LocalInnerClass {
    private int abc = 9;

    void sum(){
        class Inter{
            void display(){
                System.out.println(abc);
            }
        }
        Inter obj1 = new Inter();
        obj1.display();
    }

    public static void main(String[] args) {
        Lesson2LocalInnerClass obj = new Lesson2LocalInnerClass();
        obj.sum();
    }
}
