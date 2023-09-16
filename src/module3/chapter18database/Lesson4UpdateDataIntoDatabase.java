package module3.chapter18database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static module3.chapter18database.MyProjectUtils.*;

public class Lesson4UpdateDataIntoDatabase {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url, userName, "");
            Statement statement = connection.createStatement();
            statement.executeUpdate("update students set name=\"hola\", age=23 where id = 3");
            System.out.println("success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
