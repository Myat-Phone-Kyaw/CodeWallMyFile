package module2.chapter12exception_handling;

public class Lesson7NestedTry {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;

        System.out.println("Before");

        try {
            try {
                try {
                    int result = a/b;
                    System.out.println(result);
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("First Handling");
                }
            } catch (NullPointerException e) {
                System.out.println("Second Handling");
            }
        } catch (Exception e) {
            System.out.println("General Exception");
        }

        System.out.println("After");
    }
}
