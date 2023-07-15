package module2.chapter4.oop_basics;

public class Lesson7ReturnType {
    static int sum() {
        System.out.println("This is sum.");
        return 4;
    }

    static String name() {
        System.out.println("This is name.");
        return "Holyshit";
    }

    public static void main(String[] args) {
        sum();
        name();
        System.out.println("");
        System.out.println(sum());
        System.out.println(name());
    }
}
