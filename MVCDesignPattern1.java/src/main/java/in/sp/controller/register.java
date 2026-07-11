package in.sp.controller;

import java.net.http.HttpRequest;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Register")
public class register extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws jakarta.servlet.ServletException ,java.io.IOException {
	String myname=req.getParameter("name1");
	String myemail=req.getParameter("email1");
	int mypass=req.getParameter("password");
}
}
;