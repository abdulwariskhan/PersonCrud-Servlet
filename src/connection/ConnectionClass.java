package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
	 public static Connection getConnection()
	 {  
	      Connection con=null;  
		shkw
	        try
	        {  
	            Class.forName("com.mysql.jdbc.Driver");  
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users_database","root","root");
	            if(con != null) 
	            {
	            	System.out.println("Connection sucess");
	            }else
	            System.out.println("Connection fail...");
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }  
	        return con;  
	    } 
	 public static void main(String args[]) {
		 System.out.println(getConnection());
	 }
}
