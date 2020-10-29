package hibernate_demo1.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class JdbcConnection {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni";
		String user = "ajay";
		String pass = "1101";
		
		try {
			System.out.println("Connecting to JDBC");
			
			Connection connection = DriverManager.getConnection(url,user,pass);

			
			System.out.println("Connected to JDBC");
			
		} catch (SQLException e) {
			e.printStackTrace();	
		}

	}

}
