package module2.chapter4.oop_basics;

public class Lesson4Fruit {
    String color;
    double weight;
    String name;

    public static void main(String[] args) {
        Lesson4Fruit fruit1 = new Lesson4Fruit();
        fruit1.color = "Red";
        fruit1.weight = 100;
        fruit1.name = "Apple";

        Lesson4Fruit fruit2 = new Lesson4Fruit();
        fruit2.color = "Yellow";
        fruit2.weight = 85;
        fruit2.name = "Banana";

        System.out.println(fruit1.name + ", " + fruit1.color + ", " + fruit1.weight);
    }
}
