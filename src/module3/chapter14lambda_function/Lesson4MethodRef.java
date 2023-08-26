package module3.chapter14lambda_function;

interface Show {
    void display();
}

public class Lesson4MethodRef {
    void fullName() {
        System.out.println("myat phone kyaw");
    }

    static void firstName() {
        System.out.println("myat phone kyaw");
    }

    public static void main(String[] args) {
        Show show = () -> System.out.println("Something");
        show.display();

        Lesson4MethodRef lesson4MethodRef = new Lesson4MethodRef();
        Show show1 = () -> {
            lesson4MethodRef.fullName();
        };

        Show show2 = lesson4MethodRef::fullName;

        Show show3 = () -> {
            firstName();
        };

        Show show4 = Lesson4MethodRef::firstName;
    }
}
