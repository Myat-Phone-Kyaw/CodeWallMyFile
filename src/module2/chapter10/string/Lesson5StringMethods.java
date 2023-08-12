package module2.chapter10.string;

public class Lesson5StringMethods {
    public static void main(String[] args) {
        String name = "      Myat Phone Kyaw ";
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));

        System.out.println(name.length());
        System.out.println(name.trim().length());
        System.out.println(name);
        System.out.println(name.trim());
    }
}
