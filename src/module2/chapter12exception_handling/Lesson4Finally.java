package module2.chapter12exception_handling;

public class Lesson4Finally {
    public static void main(String[] args) {

        try {
//            int result = 7/2;
            int result = 7/0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally! We nailed it.");
        }
    }
}
