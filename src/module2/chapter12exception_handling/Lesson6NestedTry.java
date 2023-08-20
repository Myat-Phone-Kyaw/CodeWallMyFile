package module2.chapter12exception_handling;

public class Lesson6NestedTry {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;

        System.out.println("Before");

        try {
            try {
                int result = a/b;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("First Exception Handling");
            }

            try {
                int numbers[] = {1,2,3,4,5};
                numbers[7] = 26;
                System.out.println(numbers[7]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Second Exception Handling");
            }

            System.out.println("This is okay.");
        } catch (Exception e) {
            System.out.println("General Exception");
        }

        System.out.println("After");
    }
}
