package in.sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.sp.DB.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import in.sp.model.*;
@WebServlet("/LoginForm")
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String myemail = req.getParameter("email1");
        String mypass = req.getParameter("pass1");

        try {
            Connection con = DbConnection.getConnection();

            String sql = "SELECT * FROM register WHERE email = ? AND password = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, myemail);
            ps.setString(2, mypass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                out.println("<h2>Login Successful</h2>");
                User user=new User();
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email")); 	
                HttpSession  session =req.getSession();
                session.setAttribute("session_user", user);
                RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
                rd.forward(req, resp);
            } else {
                out.println("<h2>Wrong Email or Password!</h2>");
                out.print("Please enter correct Password");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2>Something went wrong!</h2>");
        }
    }
}