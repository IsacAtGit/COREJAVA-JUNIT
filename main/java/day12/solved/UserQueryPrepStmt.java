package day12.solved;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import day11.solved.ConnectionUtil;

//import com.fssa.learnJava.corejava.day13.ConnectionUtil;

/**
 * @author BharathwajSoundarara
 *
 */
//Explain in class what is the difference between Statement and PreparedStatement 
public class UserQueryPrepStmt {
	public static void main(String[] args) throws Exception{
		Connection connection = ConnectionUtil.getConnection();
		String query ="INSERT INTO USERS (user_name, email_id,  password) VALUES ( ?, ?, ? );";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, "bharathwaj");
		pst.setString(2, "bharathwaj.soundararajan@ctr.freshworks.com");
		pst.setString(3, "password007");
		System.out.println(pst.toString());
		int rows2 = pst.executeUpdate();
		System.out.println("No of rows inserted :" + rows2 );
		pst.close();
	
	}
	
}