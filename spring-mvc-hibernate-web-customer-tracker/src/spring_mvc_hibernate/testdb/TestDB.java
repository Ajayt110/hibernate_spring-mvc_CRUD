package spring_mvc_hibernate.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class TestDB
 */
@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Setting Connection
		
		 String userString = "ajay";
		
		 String passString = "1101";
		 
		 String urlString="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		 
		 String driverString="com.mysql.jdbc.Driver";
		 
		 try {
			
			 PrintWriter out=response.getWriter();
			 
			 Class.forName(driverString);
			 
			 Connection connection=DriverManager.getConnection(urlString, userString, passString);
			 
			 out.println("Connection Successful !");
			 
			 connection.close();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Get Connection
		
	}

}
