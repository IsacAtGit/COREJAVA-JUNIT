package day12.solved;

/**
 * 
 */



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import day11.solved.ConnectionUtil;
 
/**
 * @author BharathwajSoundarara
 *
 */

public class UserQuery {
 
    public static void main(String[] args) throws Exception {       
         
        
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);
         
        Statement stmt = connection.createStatement();
         
        // Step 03: Execute Insert Query
        String query ="INSERT INTO USERS (user_name, email_id, password) VALUES (\"vinit_gore\",\"vinit.gore@ctr.freshworks.com\", \"password007\")";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted :" + rows );
         
        //Step 04: Execute SELECT Query
        final String selectQuery = "SELECT user_id,user_name,email_id FROM USERS";
         
        //Step 05: Get the resultset
        ResultSet rs = stmt.executeQuery(selectQuery);
         
        //Step 06: Iterate the result
        while ( rs.next()) {
        	int userId = rs.getInt("user_id");            
        	String userName = rs.getString("user_name");
            String emailID = rs.getString("email_id");
             
            System.out.println("UserId:" + userId +", UserName:" + userName + ", EMAIL ID:" + emailID);
        }
         
        //Step 07: close the connection resources       
        rs.close();
        stmt.close();
        connection.close();
         
         
         
    }
     
}