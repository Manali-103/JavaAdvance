package Manali;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	public static Connection buildConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Connection main (System [] args) throws Exception {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClassName);
		String connectionUrl = "jdbc:mysql://localhost:3306/Cdac_Nov_23?useSSL=false";
		String userId = "root";
		String password = "root";
			
		Connection	dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
		return dbConnection;
		
		
	}

	
}
