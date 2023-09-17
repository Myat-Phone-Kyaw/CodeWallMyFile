package module3.chapter18database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static module3.chapter18database.MyProjectUtils.*;

public class Lesson5DeleteDataFromDatabase {
    public static void main(String[] args) {
        System.out.print("Enter a row number you want to delete: ");
        try {
            Connection connection = DriverManager.getConnection(url, userName, "");
            Statement statement = connection.createStatement();
            statement.executeUpdate("delete from students where id ="+new Scanner(System.in).nextInt());
            System.out.println("success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Lesson1SelectDataFromDatabase.getData();
    }
}
