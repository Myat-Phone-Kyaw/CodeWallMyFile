package module2.chapter12exception_handling.handling;

public class Lesson4NullPointerHandling {
    public static void main(String[] args) {
        System.out.println("Before");

        try {
            String name = null;
            System.out.println(name.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        System.out.println("After");
    }
}
