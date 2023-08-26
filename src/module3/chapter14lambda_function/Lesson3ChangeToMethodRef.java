package module3.chapter14lambda_function;

interface Writeable{
    void show(String name);
}
public class Lesson3ChangeToMethodRef {
    public static void main(String[] args) {
        Writeable writeable = System.out::println;
        writeable.show("Myat Phone Kyaw");
    }
}
