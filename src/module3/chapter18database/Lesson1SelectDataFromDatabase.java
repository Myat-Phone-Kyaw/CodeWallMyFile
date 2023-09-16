package module3.chapter18database;

import java.sql.*;

import static module3.chapter18database.MyProjectUtils.*;

public class Lesson1SelectDataFromDatabase {

    static void getData() {
        try {
            Connection connection = DriverManager.getConnection(url, userName, "");
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
