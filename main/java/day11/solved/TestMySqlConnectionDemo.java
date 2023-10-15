package day11.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestMySqlConnectionDemo {
  public static void main(String[] args) throws SQLException {
	  String url = "jdbc:mysql://localhost:3306/fssa";
	String userName="root";
	String password="123456";
	String query= "Select * FROM users";
	Connection con= DriverManager.getConnection(url, userName, password);
	
	System.out.println("connection is created");
	
	Statement statement=con.createStatement();
	ResultSet result=statement.executeQuery(query);
}
}
