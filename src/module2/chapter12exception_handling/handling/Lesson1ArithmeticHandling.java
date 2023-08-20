package module2.chapter12exception_handling.handling;

public class Lesson1ArithmeticHandling {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;

        System.out.println("Before");

        try {
            int result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println(e);
            /*System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println("This is an exception");*/


            //Handle by changing the values
//            int result = a/(b+2);
//            System.out.println(result);

            //Exception Again
//            int result = a/b;
//            System.out.println(result);
        }

        System.out.println("After");
    }
}
