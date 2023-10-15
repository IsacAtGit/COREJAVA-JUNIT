package day11.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ResuableTestConnection {
 
    public static void main(String[] args) throws SQLException {
 
        Connection connection = ResuableTestConnection.getConnection();     
        System.out.println(connection);
 
    }
 
    public static Connection getConnection() {
         
        Connection connection  = null;
        try
        {
   
         
             String url = "jdbc:mysql://localhost:3306/fssa_hacker";
             connection = DriverManager.getConnection(url,"root", "root");
         
        } catch (Exception e) {         
            e.printStackTrace();
            throw new RuntimeException("Unable to connect to the database");
        }
        return connection;
    }
 
}
