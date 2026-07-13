package in.sp.controller;

import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;

import in.sp.DB.DbConnection;
import jakarta.servlet.RequestDispatcher;
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
		
	Connection con=DbConnection.getConnection();//        call connection method from Dbconnnection to connect database
		String sql_query="INSERT INTO register VALUES(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql_query);// to execute sql queries
		ps.setString(1,myname );
		ps.setString(2,myemail );
		ps.setString(3,mypass );
		
		int count=ps.executeUpdate();		
		if(count>0) {
			PrintWriter out = resp.getWriter();
			out.println("<h3>Registration Successfully</h3>");

			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
		}
		else {	
			PrintWriter out = resp.getWriter();
			out.println("<h3>Registration Failed</h3>");

			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
		} 
	} catch (Exception e) {	
		// TODO: handle exception
		e.printStackTrace();	
	}
}
}
