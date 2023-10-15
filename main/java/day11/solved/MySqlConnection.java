package day11.solved;

import java.sql.*;

public class MySqlConnection {
public static void main(String[] args) throws SQLException {
	String url = "jdbc:mysql://localhost:3306/fssa";
	String userName = "root";
	String password = "123456";
	
	String query = "SELECT * FROM users";
	
	Connection con = DriverManager.getConnection(url, userName, password);
	
	System.out.println("connection created...");

	Statement statement = con.createStatement();
	ResultSet result = statement.executeQuery(query);
	
	while(result.next()) {
	
	System.out.println("id : " + result.getInt(1));
	System.out.println("Name : " + result.getString(2));
	System.out.println("email : "+ result.getString(4));
	
	}


	con.close();
	insertRecords(url, userName, password);
}

	
	public static void insertRecords(String url,String userName,String password) throws SQLException{ 

		String query = "INSERT INTO users (first_name,last_name,email_id,password,github_username) VALUES (?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url,userName,password);
		
		PreparedStatement preparedStatement = con.prepareStatement(query);
		
		
		String first_name = "aakash";
		String last_name = "balamurugan";
		String email_id ="aaksh@gmail.com";
		String password1 = "12345";
		String github_username = "aakash205";
		
		preparedStatement.setString(1, first_name );
		preparedStatement.setString(2, last_name);
		preparedStatement.setString(3, email_id);
		preparedStatement.setString(4, password1);
		preparedStatement.setString(5, github_username);
	    int rows = preparedStatement.executeUpdate();
		
	    System.out.println("Number of rows affected: " + rows);
	
 	con.close();
 	
  }
	

}