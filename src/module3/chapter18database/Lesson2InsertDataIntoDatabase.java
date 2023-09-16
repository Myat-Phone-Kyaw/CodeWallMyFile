package module3.chapter18database;

import java.sql.*;

import static module3.chapter18database.MyProjectUtils.*;

public class Lesson2InsertDataIntoDatabase {
    static void insert(){
        try {
            Connection connection = DriverManager.getConnection(url, userName, "");
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
