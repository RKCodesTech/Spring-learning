package in.sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.sp.DB.DbConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;          //mvc_db databse name

@WebServlet("/LoginForm")
public class login extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	resp.setContentType("Text");
	String myemail=req.getParameter("email1");
	String mypass=req.getParameter("pass1");
	try {
		Connection con=DbConnection.getConnection();
		String sql_Query="SELECT * FROM register WHERE email=? 	AND password=?";
		PreparedStatement ps= con.prepareStatement(sql_Query);
		ps.setString(1, myemail);
		ps.setString(2, mypass);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			
		}else {
			out.println("worng email or password ");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();
	}
	super.doPost(req, resp);
}
}
