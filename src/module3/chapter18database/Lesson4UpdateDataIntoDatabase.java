package module3.chapter18database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Lesson4UpdateDataIntoDatabase {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_in_class6", "root", "");
            Statement statement = connection.createStatement();
            statement.executeUpdate("update students set name=\"hola\", age=23 where id = 3");
            System.out.println("success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
