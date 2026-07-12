package in.sp.controller;

import java.net.http.HttpRequest;
import java.sql.PreparedStatement;

import in.sp.DB.DbConnection;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;

@WebServlet("/Register")
public class register extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws jakarta.servlet.ServletException ,java.io.IOException {
	String myname=req.getParameter("name1");
	String myemail=req.getParameter("email1");
	String mypass=req.getParameter("password");
	try {
		
		Connection con= DbConnection.getConnection();//        call connection method from Dbconnnection to connect database
		String sql_query="INSERT INTO register VALUES(?,?,?)";
		PreparedStatement ps=con.prepareStatement("sql_query");// to execute sql queries
		ps.setString(0,myname );
		ps.setString(1,myemail );
		ps.setString(2,mypass );
		
		int count=ps.executeUpdate();		
		if(count>0) {
			System.out.println("Insertion successfully");
		}
		else {
			System.out.print("insertion Failed");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
