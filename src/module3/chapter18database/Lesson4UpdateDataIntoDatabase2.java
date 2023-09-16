package module3.chapter18database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static module3.chapter18database.MyProjectUtils.*;

public class Lesson4UpdateDataIntoDatabase2 {
    public static void main(String[] args) {
        Scanner scnName = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String nameIn = scnName.nextLine();

        Scanner scnAge = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int ageIn = scnAge.nextInt();

        Scanner scnId = new Scanner(System.in);
        System.out.print("Enter the id you want to change: ");
        int idIn = scnId.nextInt();

        System.out.println(nameIn + ageIn);
        try {
            Connection connection = DriverManager.getConnection(url, userName, "");
            Statement statement = connection.createStatement();
            statement.executeUpdate("update students set name=\""+nameIn+"\", age=\""+ageIn+"\" where id = \""+idIn+"\"");
            System.out.println("success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
