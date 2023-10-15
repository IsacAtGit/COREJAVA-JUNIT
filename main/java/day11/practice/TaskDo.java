package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import day11.solved.ConnectionUtil;

class Task {
	int id;
	String name;
	String status;

	public Task(String name, String status) {
		this.name = name;
		this.status = status;

	}
}


// Create Junit Test case and test the TaskDao.createTask method
public class TaskDo {

	public static boolean createTask(Task task) throws DAOException {

		if (task == null) {
			throw new DAOException("Task object cannot be null");

		}

		String url = "jdbc:mysql://localhost:3306/Task";
		String userName = "root";
		String password = "123456";
		Connection con = null;
		// Write code here to get connection

		try {
			con = DriverManager.getConnection(url, userName, password);

		}

		catch (SQLException ex) {
			throw new DAOException("Connection is not created");
		}

		String query = "INSERT INTO Task (name,status) VALUES (?,?)";
		
		try {
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1, task.name );
		preparedStatement.setString(2, task.status);
		 preparedStatement.executeUpdate();
		}
		catch(SQLException ex) {
			throw new DAOException("Cant run prepared statement");
			
			
		}
		
			ConnectionUtil.close(con, null, null);
			System.out.println("Task completed");
			return true;
		// Create insert statement
		// Execute insert statement
		// close connection
	}


	public static void main(String[] args)throws DAOException{
		
		Task task1=new Task("Learn java","Completed");
		try {
			createTask(task1);
			
		}
		catch(DAOException ex) {
			throw new DAOException(ex.getMessage());
			
		}

	}

}