package in.sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import in.sp.DB.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String myname = req.getParameter("name1");
        String myemail = req.getParameter("email1");
        String mypass = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try {

            Connection con = DbConnection.getConnection();

            String sql = "INSERT INTO register(name,email,password) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, myname);
            ps.setString(2, myemail);
            ps.setString(3, mypass);

            int count = ps.executeUpdate();

            if (count > 0) {

                RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
                rd.forward(req, resp);

            } else {

                out.println("<h2>Registration Failed!</h2>");
            }

            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
            out.println("<h2>Something went wrong!</h2>");
        }

    }

}