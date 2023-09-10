package module3.chapter18database;

import java.sql.*;

public class Lesson1SelectDataFromDatabase {

    static void getData() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_in_class6", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");
            String str = "";
            while (resultSet.next()) {
                str = str.concat("Id : " + resultSet.getInt("id") + "," + "\t" + "Name is : " + resultSet.getString("name") + "\n");
            }
            System.out.println(str);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        getData();
    }
}
