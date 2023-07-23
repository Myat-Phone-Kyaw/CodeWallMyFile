package module2.chapter5inheritance;

public class Lesson7Aggregation {
    public static void main(String[] args) {
        Address1 address1 = new Address1("Yangon", "Thar Se Street", 523);
        Student1 student1 = new Student1(2, "Myat Phone Kyaw", 23, obj);
        System.out.println(student1.address.city);
        System.out.println(address1.city);
        System.out.println(student1.address.street);
    }
}

class Address1 {
    String city;
    String street;
    int number;

    public Address1(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }
}

class Student1 {
    int id;
    String name;
    int age;
    Address1 address;
    public Student1(int id, String name, int age, Address1 address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}