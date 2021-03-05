package subTask1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class Application {
    public static void main(String[] args) throws SQLException {
        Database foo = Database.getInstance();
        String sql="SELECT * FROM users";
        ResultSet resultSet=foo.query(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("user_id");
            String name = resultSet.getString("name");
            System.out.println("id: " + id);
            System.out.println("Name: " + name);
        }
    }
}
