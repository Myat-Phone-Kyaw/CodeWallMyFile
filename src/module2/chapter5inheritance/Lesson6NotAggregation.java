package module2.chapter5inheritance;

public class Lesson6NotAggregation {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Myat Phone Kyaw", 23, "Yangon", "Taung Nyo street", 523);
        System.out.println(student1.id);

    }
}

class Address {
    String city;
    String street;
    int number;

    public Address(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }
}

class Student extends Address{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age, String city, String street, int number) {
        super(city, street, number);
        this.id = id;
        this.name = name;
        this.age = age;
    }
}