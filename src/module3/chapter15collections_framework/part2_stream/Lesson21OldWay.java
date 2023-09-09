package module3.chapter15collections_framework.part2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson21OldWay {
    public static void main(String[] args) {
        List<List<String>> allStudents = new ArrayList<>();

        List<String> row1Students = new ArrayList<>();
        row1Students.add("AA");
        row1Students.add("BB");
        row1Students.add("CC");

        List<String> row2Students = new ArrayList<>();
        row2Students.add("AAA");
        row2Students.add("BBB");
        row2Students.add("CCC");

        List<String> row3Students = new ArrayList<>();
        row3Students.add("AAAA");
        row3Students.add("BBBB");
        row3Students.add("CCCC");

        allStudents.add(row1Students);
        allStudents.add(row2Students);
        allStudents.add(row3Students);

        System.out.println(allStudents);
        System.out.println(allStudents.get(1));

        System.out.println(row1Students.stream().map(String::toLowerCase).toList());

        System.out.println(allStudents.stream().flatMap(strings -> strings.stream().map(String::toLowerCase)).toList());

        for (List<String> studentName : allStudents) {
            for (String s : studentName) {
                System.out.println(s.toLowerCase());
            }
        }

        for (String studentName : row1Students) {
            System.out.println("Old method row1 : " + studentName.toLowerCase());
        }

        List<String> studentList = allStudents.stream().flatMap(rowStudent -> rowStudent.stream().map(String::toLowerCase)).collect(Collectors.toList());
        studentList.add("Myat Phone Kyaw");
        System.out.println(studentList);
    }
}
