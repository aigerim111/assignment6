package subTask1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Database {
    private static Database database;
    Connection con=null;
    private Database(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shopnum1","postgres", "*********");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }catch (Exception e) {
              System.out.println(e);
    }
    }

    public static Database getInstance(){
        if (database == null) {
            database = new Database();

        }
        return database;
    }

public ResultSet query (String sql) throws SQLException {
    Database d = Database.getInstance();
    Statement stmt= con.createStatement();
    ResultSet resultSet = stmt.executeQuery(sql);
    return resultSet;
}
}

