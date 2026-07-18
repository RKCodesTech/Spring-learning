<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="in.sp.model.User" %>

<%
    User user = (User) session.getAttribute("session_user");

    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

<h2>WELCOME <%= user.getName() %></h2>

<h3>Name : <%= user.getName() %></h3>
<h3>Email : <%= user.getEmail() %></h3>

<br><br>

<a href="Logout">Logout</a>

</body>
</html>