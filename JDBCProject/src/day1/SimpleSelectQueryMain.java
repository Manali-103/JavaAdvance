package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.load the driver
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        try {
        	Class.forName(driverClassName);
        	System.out.println("Driver loaded");
        	
        	String connectionUrl = "jdbc:mysql://localhost:3306/employee";
        			String userId = "root";
        	        String password = "root";
        	        
        	      Connection dbConnection =
        	   DriverManager.getConnection(connectionUrl, userId, password);
        	       System.out.println("Connected to db");
        }
        catch(ClassNotFoundException | SQLException e) {
        	 e.printStackTrace();
        }
	}
}
