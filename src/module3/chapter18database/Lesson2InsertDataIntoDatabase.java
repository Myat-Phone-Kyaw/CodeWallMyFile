package module3.chapter18database;

import java.sql.*;

public class Lesson2InsertDataIntoDatabase {
    static void insert(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_in_class6", "root", "");
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into students values( , \"sdfjksdl\", 24)");
            System.out.println("success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        insert();
        Lesson1SelectDataFromDatabase.getData();
    }
}
