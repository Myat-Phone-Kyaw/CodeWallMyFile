package module2.chapter4.oop_basics;

public class Lesson5Student {
    int id;
    String name;
    int age;
    static String schoolName = "CodeWall Technologies";

    public static void main(String[] args) {
        Lesson5Student student1 = new Lesson5Student();
        student1.id = 1;
        student1.name = "Ryan";
        student1.age = 19;

        Lesson5Student student2 = new Lesson5Student();
        student2.id = 2;
        student2.name = "Charles";
        student2.age = 23;

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        student1.schoolName = "WallCode Technologies";

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}
