package module3.chapter14lambda_function;

// Functional Interface
interface Test{
    void show();
}
public class Lesson1LambdaFunction {
    public static void main(String[] args) {
        // simple Way
        Test test1 = new Test() {
            @Override
            public void show() {
                System.out.println("This is Task.");
            }
        };
        test1.show();

        // erase
        Test test2 = () -> {
            System.out.println("This is task 1.");
            System.out.println("This is task 2.");
            System.out.println("This is task 3.");
        };

        // shortcut
        Test test3 = () -> System.out.println("This is one-line task.");

        // replace by IDE
        Test test4 = () -> {

        };

    }
}
