package in.sp.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
public static Connection getConnection() {// made maethod static to call direclty like  DbConnection.getConnection; in register.java
	Connection con=null;
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_db","root","1234");

		 
	} catch (Exception e) {
		e.printStackTrace();//for incorrect password	
		
	}
	return con;
}
}
	